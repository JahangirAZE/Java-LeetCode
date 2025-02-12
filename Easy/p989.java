class Solution {
  public List<Integer> addToArrayForm(int[] num, int k) {
    List<Integer> result = new ArrayList<>();
    int i = num.length - 1, carry = 0;

    while (i >= 0 || k > 0 || carry > 0)
    {
      int digit = (i >= 0 ? num[i] : 0) + (k % 10) + carry;
      result.add(digit % 10);
      carry = digit / 10;
      k /= 10;
      i--;
    }
    Collections.reverse(result);
    return result;
  }
}
