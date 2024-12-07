class Solution {
  public String reverseWords(String s) {
    StringBuilder sb = new StringBuilder();
    String[] words = s.split(" ");
    for (int i = 0; i < words.length; i++)
    {
      StringBuilder reversed = new StringBuilder(words[i]).reverse();
      sb.append(reversed);
      if(i != words.length - 1) sb.append(" ");
    }
    return sb.toString();
  }
}
