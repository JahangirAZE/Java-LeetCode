class Solution {
  public int[][] imageSmoother(int[][] img) {
    int rows = img.length, cols = img[0].length;
    int[][] result = new int[rows][cols];
    int[][] directions = { {0, 0}, {0, 1}, {0, -1}, {1, 0}, {-1, 0}, {1, 1}, {-1, -1}, {-1, 1}, {1, -1} };
    for (int i = 0; i < rows; i++)
    {
      for (int j = 0; j < cols; j++)
      {
        int sum = 0, count = 0;
        for (int[] d : directions)
        {
          int newRow = i + d[0];
          int newCol = j + d[1];

          if (newRow >= 0 && newRow < rows && newCol >= 0 && newCol < cols) 
          {
            sum += img[newRow][newCol];
            count++;
          }
        }
        result[i][j] = sum / count;
      }
    }
    return result;
  }
}
