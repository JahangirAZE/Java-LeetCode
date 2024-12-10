class Solution {
  public int[] findErrorNums(int[] nums) {
    int n = nums.length;
    int[] result = new int[2];
    int[] frequency = new int[n + 1];
    for (int num : nums)
    {
      frequency[num]++;
    }
    for (int i = 1; i <= n; i++)
    {
      if (frequency[i] == 2) result[0] = i;
      else if (frequency[i] == 0) result[1] = i;
    }
    return result;
  }
}
