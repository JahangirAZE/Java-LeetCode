class Solution {
  public int[][] matrixReshape(int[][] mat, int r, int c) {
    int rows = mat.length, cols = mat[0].length;
    if (rows*cols != r*c) return mat;

    int[][] newMatrix = new int[r][c];
    int rowIndex = 0, colIndex = 0;
    for (int i = 0; i < rows; i++)
    {
      for (int j = 0; j < cols; j++)
      {
        newMatrix[rowIndex][colIndex] = mat[i][j];
        if (colIndex == c - 1) 
        {
          rowIndex++;
          colIndex = 0;
        }
        else colIndex++;
      }
    }
    return newMatrix;
  }
}
