class Solution {
  public int removePalindromeSub(String s) {
    return isPalindrome(s) ? 1 : 2;
  }

  private boolean isPalindrome(String s) {
    int p = 0;
    int q = s.length() - 1;
    for (int i = 0; i <= s.length() / 2; i++) 
    {
      if (s.charAt(p) != s.charAt(q)) return false;
      p++;
      q--;
    }
    return true;
  }
}
