class Solution {
  public int[] sortArrayByParity(int[] nums) {
    int even = 0;
    int odd = nums.length - 1;
    int[] result = new int[nums.length];
    
    for (int num : nums) 
    {
      if (num % 2 == 0) result[even++] = num;
      else result[odd--] = num;
    }
    return result;
  }
}
