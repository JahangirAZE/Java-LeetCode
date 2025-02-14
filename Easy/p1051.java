class Solution {
  public int heightChecker(int[] heights) {
    int[] clone = heights.clone();
    int count = 0;
    Arrays.sort(clone);
    for (int i = 0; i < heights.length; i++)
    {
      if (clone[i] != heights[i]) count++;
    }
    return count;
  }
}
