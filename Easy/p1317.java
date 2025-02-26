class Solution {
  public int[] getNoZeroIntegers(int n) {
    for (int i = 1; i < n; i++)
    {
      if (!(hasZero(i) || hasZero(n - i))) return new int[] {i, n - i};
    }
    return null;
  }

  private boolean hasZero(int n) {
    while (n > 0) 
    {
      if (n % 10 == 0) return true;
      n /= 10;
    }
    return false;
  }
}
