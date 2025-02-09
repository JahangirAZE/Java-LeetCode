class Solution {
  public int binaryGap(int n) {
    String binary = Integer.toBinaryString(n);
    
    int distance = 0, next = 0, prev = 0;
    char[] bits = binary.toCharArray();
    for (int i = 0; i < bits.length; i++) 
    {
      if (bits[i] == '1') 
      {
        prev = next;
        next = i;
        distance = Math.max(distance, next - prev);
      }
    }
    return distance;
  }
}
