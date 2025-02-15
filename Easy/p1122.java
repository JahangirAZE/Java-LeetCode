class Solution {
  public int[] relativeSortArray(int[] arr1, int[] arr2) {
    Map<Integer, Integer> hashmap = new HashMap<>();
    for (int i : arr1)
    {
      hashmap.put(i, hashmap.getOrDefault(i, 0) + 1);
    }

    int[] result = new int[arr1.length];
    int index = 0;
    for (int i : arr2)
    {
      int count = hashmap.get(i);
      while (count-- > 0)
      {
        result[index++] = i;
      }
      hashmap.remove(i);
    }

    List<Integer> remaining = new ArrayList<>();
    for (int i : hashmap.keySet())
    {
      int count = hashmap.get(i);
      while (count-- > 0)
      {
        remaining.add(i);
      }
    }

    Collections.sort(remaining);
    for (int i : remaining)
    {
      result[index++] = i;
    }
    return result;
  }
}
