class Solution {
  public int[] smallerNumbersThanCurrent(int[] nums) {
    int[] freq = new int[101];
    for (int i : nums) 
    {
      freq[i]++;
    }

    int count = 0;
    for (int i = 0; i < nums.length; i++) 
    {
      for (int j = 0; j < nums[i]; j++) 
      {
        count += freq[j];
      }
      nums[i] = count;
      count = 0;
    }
    return nums;
  }
}
