class Solution {
  public String removeOuterParentheses(String s) {
    StringBuilder result = new StringBuilder();
    int count = 0;
    for (char c : s.toCharArray())
    {
      if (c == ')') count--;
      if (count != 0) result.append(c);
      if (c == '(') count++;
    }
    return result.toString();
  }
}
