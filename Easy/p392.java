class Solution {
  public boolean isSubsequence(String s, String t) {
    int p = 0, q = 0;
    while (q < t.length())
    {
      if (p < s.length() && s.charAt(p) == t.charAt(q))
      {
        p++;
        q++;
      }
      else q++;
    }
    return p == s.length();
  }
}
