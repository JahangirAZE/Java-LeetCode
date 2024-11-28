class Solution {
  public int missingNumber (int[] nums)
  {
    int n = nums.length, expectedSum = (n * (n + 1)) / 2, sumOfArray = 0;
    for (int num : nums)
    {
      sumOfArray += num;
    }
    return expectedSum - sumOfArray;
  }
}
