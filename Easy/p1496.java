class Solution {
  public boolean isPathCrossing(String path) {
    Set<Integer> hashset = new HashSet<>();
    int x = 0, y = 0;
    hashset.add(getHash(x, y));

    for (char c : path.toCharArray())
    {
      if (c == 'N') y++;
      else if (c == 'S') y--;
      else if (c == 'E') x++;
      else x--;

      if (!hashset.add(getHash(x, y))) return true;
    }
    return false;
  }

  private int getHash(int x, int y) {
    return x*1000003 + y;
  }
}
