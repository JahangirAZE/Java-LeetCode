class Solution {
  public boolean isLongPressedName(String name, String typed) {
    int p = 0, q = 0;
    while (q < typed.length())
    {
      if (p < name.length() && name.charAt(p) == typed.charAt(q))
      {
        p++;
        q++;
      }
      else if (q > 0 && typed.charAt(q) == typed.charAt(q - 1)) q++;
      else return false;
    }
    return p == name.length();
  }
}
