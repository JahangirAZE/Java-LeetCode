class Solution {

  private static final int MOD = 1_000_000_007;

  public int numPrimeArrangements(int n) {
    int count = 0;
    for (int i = 1; i <= n; i++)
    {
      if (isPrime(i)) count++;
    }
    return (int) (factorial(count)*factorial(n - count) % MOD);
  }

  private boolean isPrime(int n) {  
    if (n <= 1) return false;
    if (n == 2) return true;
    if (n % 2 == 0) return false;
    
    for (int i = 3; i * i <= n; i += 2) 
    {
      if (n % i == 0) return false;
    }
    return true;
  }

  private long factorial(int n) {
    long result = 1;
    for (int i = 2; i <= n; i++)
    {
      result = (result * i) % MOD;
    }
    return result;
  }
}
