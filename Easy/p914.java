class Solution {
  public boolean hasGroupsSizeX(int[] deck) {
    int[] freq = new int[10000];
    for (int i : deck)
    {
      freq[i]++;
    }
    int gcd = -1;
    for (int i = 0; i < 10000; i++) 
    {
      if (freq[i] > 0)
      {
        if (gcd == -1) gcd = freq[i];
        else gcd = gcd(gcd, freq[i]);
      }
    }
    return gcd > 1;
  }

  private int gcd(int a, int b) {
    if (a == 0) return b;
    return gcd(b % a, a);
  }
}
