class Solution {
  public int minCostToMoveChips(int[] position) {
    int evens = 0;
    for (int i : position)
    {
      if (i % 2 == 0) evens++;
    }
    return Math.min(evens, position.length - evens);
  }
}
