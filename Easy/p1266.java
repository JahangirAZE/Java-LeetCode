class Solution {
  public int minTimeToVisitAllPoints(int[][] points) {
    int result = 0;
    for (int i = points.length - 1; i > 0; i--)
    {
      result += calculateTime(points[i - 1], points[i]);
    }
    return result;
  }

  public int calculateTime(int[] from, int[] to) {
    int d1 = Math.abs(from[0] - to[0]);
    int d2 = Math.abs(from[1] - to[1]);
    return Math.max(d1, d2);
  }
}
