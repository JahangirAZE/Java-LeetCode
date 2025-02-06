class Solution {
  public List<Integer> selfDividingNumbers(int left, int right) {
    List<Integer> list = new ArrayList<>();
    for (int i = left; i <= right; i++) 
    {
      if (isSelfDividingNumber(i)) list.add(i);
    }
    return list;
  }

  private static boolean isSelfDividingNumber(int number) {
    int clone = number;
    while (number > 0) 
    {
      int digit = number % 10;
      if  (digit == 0) return false;
      if (clone % digit != 0) return false;
      number /= 10;
    }
    return true;
  }
}
