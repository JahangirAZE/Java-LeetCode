class Solution {
  public int distributeCandies(int[] candyType) {
    int maxCount = candyType.length / 2;
    Set<Integer> hashset = new HashSet<>();
    for (int i : candyType)
    {
      hashset.add(i);
      if (hashset.size() == maxCount) return maxCount;
    }
    return hashset.size();
  }
}
