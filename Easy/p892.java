class Solution {
  public int surfaceArea(int[][] grid) {
    int n = grid.length;
    int surfaceArea = 0;

    for (int i = 0; i < n; i++) 
    {
      for (int j = 0; j < n; j++) 
      {
        if (grid[i][j] > 0) 
        {
          surfaceArea += (grid[i][j] * 6) - ((grid[i][j] - 1) * 2);
          if (i > 0) surfaceArea -= 2 * Math.min(grid[i][j], grid[i - 1][j]);
          if (j > 0) surfaceArea -= 2 * Math.min(grid[i][j], grid[i][j - 1]);
        }
      }
    }
    return surfaceArea;
  }
}
