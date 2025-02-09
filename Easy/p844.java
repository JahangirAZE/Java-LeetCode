class Solution {
  public boolean backspaceCompare(String s, String t) {
    return getActualString(s).equals(getActualString(t));
  }

  private static String getActualString(String string) {
    Stack<Character> stack = new Stack<>();
    for (char ch : string.toCharArray()) 
    {
      if (ch == '#') 
      {
        if (!stack.isEmpty()) stack.pop();
      } 
      else stack.push(ch);
    }
    return stack.toString();
  }
}
