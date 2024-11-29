class Solution {
  public List<Integer> findDisappearedNumbers(int[] nums) {
    List<Integer> list = new ArrayList<>();
    int[] frequency = new int[nums.length];
    for(int num : nums)
    {
      frequency[num - 1]++;
    }
    for (int i = 0; i < frequency.length; i++)
    {
      if (frequency[i] == 0) list.add(i + 1);
    }
    return list;
  }
}
