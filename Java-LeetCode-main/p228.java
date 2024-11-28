class Solution {
  public List<String> summaryRanges(int[] nums)
  {
    List<String> list = new ArrayList<>();
    if (nums.length == 0 || nums == null) return list;
    int i = 0;

    while (i < nums.length)
    {
      int start = nums[i];
      while (i < nums.length - 1 && nums[i] + 1 == nums[i + 1]) i++;
      if (nums[i] != start) list.add(start + "->" + nums[i]);
      else list.add(String.valueOf(start));
      i++;
    }
    return list;
  }
}
