class Solution {
  public int countLargestGroup(int n) {
    int[] freq = new int[37];
    for (int i = 1; i <= n; i++)
    {
      freq[getSumOfDigits(i)]++;
    }
  
    int max = 0, count = 0;
    for (int i : freq)
    {
      if (max == i) count++;
      else if (max < i)
      {
        max = i;
        count = 1;
      }
    }
    return count;
  }
  
  private int getSumOfDigits(int n) {
    int sum = 0;
    while (n > 0)
    {   
      sum += n % 10;
      n /= 10;
    }
    return sum;
  }
}
