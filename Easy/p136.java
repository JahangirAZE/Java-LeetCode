class Solution {
  public int singleNumber(int[] nums)
  {
    for (int num : nums)
    {
      result ^= num;
    }
    return result;
  }
}
