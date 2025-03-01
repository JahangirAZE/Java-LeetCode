class Solution {
  public int[] runningSum(int[] nums) {
    int[] result = new int[nums.length];
    int current = 0;
    for (int i = 0; i < nums.length; i++) 
    {
      current += nums[i];
      result[i] = current;
    }
    return result;
  }
}
