class Solution {
  public int countPrimeSetBits(int left, int right) {
    int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31 };
    boolean[] primeBool = new boolean[32];
    for (int p : primes) 
    {
      primeBool[p] = true;
    }
    
    int count = 0;
    for (int i = left; i <= right; i++) 
    {
      if (primeBool[Integer.bitCount(i)]) count++;
    }
    return count;
  }
}
