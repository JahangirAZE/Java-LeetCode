class Solution {
  public int[] shortestToChar(String s, char c) {
    int[] distances = new int[s.length()];
    int prev = s.indexOf(c);
    int next = s.indexOf(c);
    
    for (int i = 0; i < s.length(); i++) 
    {
      if (i == next) 
      {
        prev = next;
        next = s.indexOf(c, next + 1);
      }
      distances[i] = (next == -1) 
        ? Math.abs(i - prev) 
        : Math.min(Math.abs(i - prev), Math.abs(i - next));
    }
    return distances;
  }
}
