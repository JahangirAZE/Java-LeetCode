class Solution {
  public int mySqrt(int x)
  {
    int left = 1;
    int right = x;

    while (left <= right)
    {
      int middle = left + (right - left) / 2;
      if (middle == x / middle) return middle;
      else if (middle < x / middle) left = middle + 1;
      else right = middle - 1;
    }
    return right;
  }
}
