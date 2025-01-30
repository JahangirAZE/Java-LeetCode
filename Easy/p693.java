class Solution {
  public boolean hasAlternatingBits(int n) {
      StringBuilder binary = new StringBuilder();
      while (n > 0) {
        binary.append(n % 2);
        n /= 2;
      }

      char[] bits = binary.toString().toCharArray();
      for (int i = 0; i < bits.length - 1; i++) {
        if (bits[i] == bits[i + 1]) return false;
      }
      return true;
  }
}
