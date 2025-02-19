class Solution {
  public int countNegatives(int[][] grid) {
    int count = 0;
    for (int[] nums : grid)
    {
      count += binarySearch(nums);
    }
    return count;
  }

  private int binarySearch(int[] nums)
  {
    int l = 0;
    int r = nums.length - 1;
    while (l <= r)
    {
      int m = l + (r - l) / 2;
      if (nums[m] >= 0) l = m + 1;
      else if (nums[m] < 0) r = m - 1;
    }
    return nums.length - l;
  }
}
