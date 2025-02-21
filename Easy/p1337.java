class Solution {
  public int[] kWeakestRows(int[][] mat, int k) {
    List<int[]> rows = new ArrayList<>();
    for (int i = 0; i < mat.length; i++)
    {
      int sum = 0;
      for (int j = 0; j < mat[0].length && mat[i][j] != 0; j++)
      {
        sum++; 
      }
      rows.add(new int[]{sum, i});
    }
    Collections.sort(rows, (a, b) -> {
      if (a[0] != b[0]) return a[0] - b[0]; 
      else return a[1] - b[1];
    });
                   
    int[] result = new int[k];
    for (int i = 0; i < k; i++)
    {
      result[i] = rows.get(i)[1];
    }
    return result;
  }
}
