class Solution {
  public String toGoatLatin(String sentence) {
    StringBuilder sb = new StringBuilder();
    int i = 1;
    for (String word : sentence.split(" ")) 
    {
      char first = word.charAt(0);
      if (first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u' || first == 'A' || first == 'E' || first == 'I' || first == 'O' || first == 'U') 
      {
        sb.append(word);
      }
      else sb.append(word.substring(1, word.length())).append(word.charAt(0));
      sb.append("ma").append("a".repeat(i));
      sb.append(" ");
      i++;
    }
    sb.deleteCharAt(sb.length() - 1);
    return sb.toString();
  }
}
