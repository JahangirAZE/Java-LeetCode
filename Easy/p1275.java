class Solution {
  public String tictactoe(int[][] moves) {
    char[][] board = new char[3][3];
    for (int i = 0; i < moves.length; i++) 
    {
      int x = moves[i][0];
      int y = moves[i][1];
      if (i % 2 == 0) board[x][y] = 'X';
      else board[x][y] = 'O';
    }

    for (int i = 0; i < 3; i++) 
    {
      if (board[i][0] == board[i][1] && board[i][1] == board[i][2])
      {
        if (board[i][0] == 'X') return "A";
        if (board[i][0] == 'O') return "B";
      }
    }

    for (int i = 0; i < 3; i++) 
    {
      if (board[0][i] == board[1][i] && board[1][i] == board[2][i]) 
      {
        if (board[0][i] == 'X') return "A";
        if (board[0][i] == 'O') return "B";
      }
    }

    if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) 
    {
      if (board[0][0] == 'X') return "A";
      if (board[0][0] == 'O') return "B";
    }

    if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) 
    {
      if (board[0][2] == 'X') return "A";
      if (board[0][2] == 'O') return "B";
    }

    if (moves.length == 9) return "Draw";
    return "Pending";
  }
}
