class Solution {
  public String generateTheString(int n) {
    return (n % 2 != 0) ? "a".repeat(n) : "a".repeat(n - 1) + "b";
  }
}
