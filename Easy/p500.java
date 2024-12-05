class Solution {
  public String[] findWords(String[] words) {
    String row1 = "qwertyuiop";
    String row2 = "asdfghjkl";
    String row3 = "zxcvbnm";
    List<String> list = new ArrayList<>();

    for (String word : words)
    {
      String S = word.toLowerCase();
      char firstChar = S.charAt(0);
      String flagRow = (row1.indexOf(firstChar) != -1) ? row1 : (row2.indexOf(firstChar) != -1) ? row2 : row3;
      boolean isValid = true;
      for (char c : S.toCharArray())
      {
        if (flagRow.indexOf(c) == -1)
        {
          isValid = false;
          break;
        }
      }
      if (isValid) list.add(word);
    }
    return list.toArray(new String[0]);
  }
}
