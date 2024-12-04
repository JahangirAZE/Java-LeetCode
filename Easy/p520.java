class Solution {
  public boolean detectCapitalUse(String word) {
    int capitalCount = 0;
    boolean firstIsCapital = Character.isUpperCase(word.charAt(0));
    for (char c : word.toCharArray())
    {
      if (Character.isUpperCase(c)) capitalCount++;
    }
    if (firstIsCapital) return capitalCount == 1 || capitalCount == word.length();
    else return capitalCount == 0;
  }
}
