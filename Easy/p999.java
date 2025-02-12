class Solution {
  public int numRookCaptures(char[][] board) {
    int x = 0;
    int y = 0;
    outer:
    for (int i = 0; i < 8; i++)
    {
      for (int j = 0; j < 8; j++)
      {
        if (board[i][j] == 'R')
        {
          x = i;
          y = j;
          break outer;
        }
      }
    }

    int count = 0;
    int[][] directions = { {0, -1}, {0, 1}, {-1, 0}, {1, 0} };
    for (int[] dir : directions)
    {
      int i = x;
      int j = y;
      while (true)
      {
        i += dir[0];
        j += dir[1];
        if (i < 0 || i >= 8 || j < 0 || j >= 8 || board[i][j] == 'B') break;
        else if (board[i][j] == 'p')
        {
          count++;
          break;
        }
      }
    }
    return count;
  }
}
