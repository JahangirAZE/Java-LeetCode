class Solution {
  public boolean isHappy(int n)
  {
    Set<Integer> hashset = new HashSet<>();
    while (n != 1)
    {
      int sum = 0;
      while (n > 0)
      {
        int digit = n % 10;
        sum += digit * digit;
        n /= 10;
      }
      if (hashset.contains(sum)) return false;
      hashset.add(sum);
      n = sum;
    }
    return true;
  }
}
