class Solution {
  public boolean repeatedSubstringPattern(String s) {
    String doubled = s + s;
    String stripped = doubled.substring(1, doubled.length() - 1);
    return stripped.contains(s);
  }
}
