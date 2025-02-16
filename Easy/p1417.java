class Solution {
  public String reformat(String s) {
    StringBuilder letters = new StringBuilder();
    StringBuilder digits = new StringBuilder();
    for (char c : s.toCharArray()) 
    {
      if (Character.isLetter(c)) letters.append(c);
      else digits.append(c);
    }
    if (Math.abs(letters.length() - digits.length()) > 1) return "";
    
    StringBuilder result = new StringBuilder();
    boolean letter_first = letters.length() >= digits.length();
    while (letters.length() > 0 || digits.length() > 0) {
      if (letter_first && letters.length() > 0) 
      {
        result.append(letters.charAt(0));
        letters.deleteCharAt(0);
      } 
      else if (!letter_first && digits.length() > 0) 
      {
        result.append(digits.charAt(0));
        digits.deleteCharAt(0);
      }
      letter_first = !letter_first;
    }
    return result.toString();        
  }
}
