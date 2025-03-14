class Solution {
  public double largestTriangleArea(int[][] points) {
    int length = points.length;
    double maxArea = Double.MIN_VALUE;
    
    for (int i = 0; i < length; i++) 
    {
      for (int j = i + 1; j < length; ++j) 
      {
        for (int k = j + 1; k < length; ++k) 
        {
          maxArea = Math.max(maxArea, area(points[i], points[j], points[k]));
        }
      }
    }
    return maxArea;
  }

  private double area(int[] P, int[] Q, int[] R) {
    return 0.5 * Math.abs(P[0]*Q[1] + Q[0]*R[1] + R[0]*P[1] - P[1]*Q[0] - Q[1]*R[0] - R[1]*P[0]);
  }
}
