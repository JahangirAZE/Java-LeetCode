class Solution {
  public int oddCells(int m, int n, int[][] indices) {
    int[] rows = new int[m];
    int[] columns = new int[n];
    for (int i[] : indices)
    {
      rows[i[0]]++;
      columns[i[1]]++;
    }
    
    int r = helper(rows);
    int c = helper(columns);
    return c*(m - r) + r*(n - c);
  }

  private int helper(int[] arr) {
    int count = 0;
    for (int i = 0; i < arr.length; i++)
    {
      if (arr[i] % 2 != 0) count++;
    }
    return count;
  }
}
