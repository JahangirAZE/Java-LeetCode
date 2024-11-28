class NumArray {
  private int[] prefix;
  public NumArray(int[] nums)
  {
    prefix = new int[nums.length];
    int current = 0;
    for (int i = 0; i < nums.length; i++)
    {
      current += nums[i];
      prefix[i] = current; 
    }
  }

  public int sumRange(int left, int right)
  {
    if (left == 0) return prefix[right];
    return prefix[right] - prefix[left - 1];
  }
}
