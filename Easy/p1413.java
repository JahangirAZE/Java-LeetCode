class Solution {
  public int minStartValue(int[] nums) {
    int min = 0, sum = 0;
    for (int i = 0; i < nums.length; i++)
    {
      sum += nums[i];
      if (sum < 1) min = Math.min(min, sum);
    }
    return 1 - min;
  }
}
