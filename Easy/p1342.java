class Solution {
  public int numberOfSteps(int num) {
    return Integer.toBinaryString(num).length() + Integer.bitCount(num) - 1;
  }
}
