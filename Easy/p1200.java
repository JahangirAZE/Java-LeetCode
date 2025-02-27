class Solution {
  public List<List<Integer>> minimumAbsDifference(int[] nums) {
    Arrays.sort(nums);
    int min = Integer.MAX_VALUE;
    List<List<Integer>> list = new ArrayList<List<Integer>>();
    
    for (int i = 1; i < nums.length; i++)
    {
      int temp = nums[i] - nums[i - 1];
      if (temp < min)
      {
        min = temp;
        list.clear();
        list.add(Arrays.asList(nums[i - 1], nums[i])); 
      } 
      else if (temp == min) list.add(Arrays.asList(nums[i - 1], nums[i]));
    }
    return list;
  }
}
