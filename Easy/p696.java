class Solution {
  public int countBinarySubstrings(String s) {
    int[] groups = new int[s.length()];
    int t = 0;
    groups[0] = 1;
    for (int i = 1; i < s.length(); i++) 
    {
      if (s.charAt(i - 1) != s.charAt(i)) groups[++t] = 1;
      else groups[t]++;
    }
    
    int result = 0;
    for (int i = 1; i <= t; i++) 
    {
      result += Math.min(groups[i - 1], groups[i]);
    }
    return result;
  }
}
