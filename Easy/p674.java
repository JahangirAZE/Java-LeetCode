class Solution {
  public int findLengthOfLCIS(int[] nums)
  {
    int max = 1;
    int l = 0, r = 1;
    while (r < nums.length)
    {
      if (nums[r - 1] < nums[r])
      {
        r++;
        max = ((r - l) > max) ? (r - l) : max;
      }
      else
      {
        l = r;
        r++;
      }
    }
    return max;
  }
}
