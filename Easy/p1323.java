class Solution {
  public int maximum69Number (int num) {
    int reverse = 0;
    while(num > 0) 
    {
      int digit = num % 10;
      reverse = reverse*10 + digit;
      num /= 10;
    }

    boolean isFirstTime = true;
    while (reverse > 0)
    {
      int digit = reverse % 10;
      if (digit == 6 && isFirstTime)
      {
        digit = 9;
        isFirstTime = false;
      }
      num = num*10 + digit;
      reverse /= 10;
    }
    return num;
  }
}
