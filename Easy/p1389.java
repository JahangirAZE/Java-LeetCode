class Solution {
  public int[] createTargetArray(int[] nums, int[] index) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < nums.length; i++)
    {
      list.add(index[i], nums[i]);
    }
    
    int[] result = new int[list.size()];
    int i = 0;
    for(int num : list)
    {
      result[i++] = num;
    }
    return result;
  }
}
