class Solution {
  public int lengthOfLastWord(String s)
  {
    s = s.trim();
    int last = s.lastIndexOf(' ');
    return last != -1 ? s.length() - last - 1 : s.length();
  }
}
