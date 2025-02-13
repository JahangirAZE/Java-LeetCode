class Solution {
  public int largestSumAfterKNegations(int[] nums, int k) {
    Arrays.sort(nums);
    for (int i = 0; i < nums.length && k > 0; i++)
    {
      if (nums[i] < 0)
      {
        nums[i] = -nums[i];
        k--;
      }
    }
    
    int sum = 0;
    int min = Integer.MAX_VALUE;
    for (int num : nums)
    {
      min = Math.min(min, num);
      sum += num;
    }
    return k % 2 == 0 ? sum : sum - 2 * min;
  }
}
