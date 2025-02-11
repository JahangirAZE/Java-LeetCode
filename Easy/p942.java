class Solution {
  public int[] diStringMatch(String s) {
    int[] result = new int[s.length() + 1];
    int low = 0;
    int high = s.length();
    int index = 0;
  
    for (char c : s.toCharArray())
    {
      if (c == 'I')
      {
        result[index] = low;
        index++;
        low++;
      }
      else
      {
        result[index] = high;
        index++;
        high--;
      }
    }
    result[index] = low;
    return result;
  }
}
