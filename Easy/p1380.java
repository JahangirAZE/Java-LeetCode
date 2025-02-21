class Solution {
  public List<Integer> luckyNumbers(int[][] matrix) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < matrix.length; i++) 
    {
      int min = Integer.MAX_VALUE;
      int minColIndex = -1;
      for (int j = 0; j < matrix[0].length; j++) 
      {
        if (matrix[i][j] < min)
        {
          min = matrix[i][j];
          minColIndex = j;
        }
      }
      
      boolean isLucky = true;
      for (int j = 0; j < matrix.length; j++)
      {
        if (matrix[j][minColIndex] > min)
        {
          isLucky = false;
          break;
        }
      }
      if (isLucky) list.add(min);
    }
    return list;
  }
}
