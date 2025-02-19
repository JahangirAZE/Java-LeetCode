class Solution {
  public int[] sumZero(int n) {
    int[] result = new int[n];
    int first = 0;
    int last = n - 1;
    for (int i = 1; i <= n / 2; i++)
    {
      result[first] = i;
      result[last] = -i;
      first++;
      last--;
    }
    if (n % 2 != 0) result[n / 2] = 0;
    return result;
  }
}
