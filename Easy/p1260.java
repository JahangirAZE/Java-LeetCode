class Solution {
  public List<List<Integer>> shiftGrid(int[][] grid, int k) {
    int rows = grid.length, cols = grid[0].length;
    List<Integer> list = new ArrayList<>();
    for (int[] row: grid)
    {
      for (int num : row) 
      {
        list.add(num);
      }
    }
    Collections.rotate(list, k % list.size());

    List<List<Integer>> result = new ArrayList<>();
    for (int i = 0; i < rows; i++) 
    {
      result.add(new ArrayList<>(list.subList(i*cols, (i + 1)*cols)));
    }
    return result;
  }
}
