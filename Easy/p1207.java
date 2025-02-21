class Solution {
  public boolean uniqueOccurrences(int[] arr) {
    HashMap<Integer, Integer> hashmap = new HashMap<>();
    for (int i : arr)
    {
      hashmap.put(i, hashmap.getOrDefault(i, 0) + 1);
    }
    return !hasDuplicateValues(hashmap);
  }
  private static boolean hasDuplicateValues(Map<Integer, Integer> map) {
    Set<Integer> seenValues = new HashSet<>();
    for (int value : map.values()) 
    {
      if (!seenValues.add(value)) return true;
    }
    return false;
  }
}
