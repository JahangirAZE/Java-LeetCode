class Solution {
  public String reverseOnlyLetters(String s) {
    char[] chars = s.toCharArray();
    int p = 0;
    int q = chars.length - 1;
    
    while (p < q)
    {
      if (!Character.isLetter(chars[p])) p++;
      else if (!Character.isLetter(chars[q])) q--;
      else 
      {
        char temp = chars[p];
        chars[p] = chars[q];
        chars[q] = temp;
        p++;
        q--;
      }
    }
    return new String(chars);
  }
}
