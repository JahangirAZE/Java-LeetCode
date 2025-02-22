class Solution {
  public String generateTheString(int n) {
    if (n % 2 != 0) return "a".repeat(n);
    
    StringBuilder sb = new StringBuilder();
    n--;
    while (n-- > 0)
    {
      sb.append('a');
    }
    return sb.append('b').toString();
  }
}
