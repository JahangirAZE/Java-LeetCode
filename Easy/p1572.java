class Solution {
  public int diagonalSum(int[][] mat) {
    int total = 0;
    int L = mat.length;
    for (int i = 0, j = L - 1; i < L; i++, j--)
    {
      total += mat[i][i] + mat[i][j];
    }
    return L % 2 == 0 ? total : total - mat[L / 2][L / 2];
  }
}
