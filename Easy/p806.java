class Solution {
  public int[] numberOfLines(int[] widths, String s) {
    int[] result = new int[2];
    int lineSum = 0, count = 1;
    for (char c : s.toCharArray()) 
    {
      if (lineSum + widths[c - 'a'] <= 100) lineSum += widths[c - 'a'];
      else 
      {
        count++;
        lineSum = widths[c - 'a'];
      }
    }
    result[0] = count;
    result[1] = lineSum;
    return result; 
  }
}
