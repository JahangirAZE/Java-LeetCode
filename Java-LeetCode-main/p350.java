class Solution {
  public int[] intersect(int[] nums1, int[] nums2)
  {
    Map<Integer, Integer> hashmap = new HashMap<>();
    List<Integer> list = new ArrayList<>();

    for (int num : nums1)
    {
      hashmap.put(num, hashmap.getOrDefault(num, 0) + 1);
    }
    for (int num : nums2)
    {
      if (hashmap.getOrDefault(num, 0) > 0)
      {
        list.add(num);
        hashmap.put(num, hashmap.get(num) - 1);
      }
    }
    int[] result = new int[list.size()];
    for (int i = 0; i < list.size(); i++)
    {
      result[i] = list.get(i);
    }
    return result;
  }
}
