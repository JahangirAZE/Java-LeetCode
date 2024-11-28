class Solution {
  public int[] intersection (int[] nums1, int[] nums2)
  {
    Set<Integer> hashset = new HashSet<>();
    Set<Integer> resultSet = new HashSet<>();

    for (int num : nums1)
    {
      hashset.add(num);
    }
    for (int num : nums2)
    {
      if (hashset.contains(num)) resultSet.add(num);
    }

    int[] resultArray = new int[resultSet.size()];
    int i = 0;
    for (int num : resultSet)
    {
      resultArray[i++] = num;
    }
    return resultArray;
  }
}
