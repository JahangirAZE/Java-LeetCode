class Solution {
  public int distanceBetweenBusStops(int[] distance, int s, int d) {
    if (s > d)
    {
      int temp = d;
      d = s;
      s = temp;
    }
    
    int forward = 0, totalDistance = 0;
    for (int i = 0; i < distance.length; i++)
    {
      if (i >= s && i < d) forward += distance[i];
      totalDistance += distance[i];
    }
    return Math.min(forward, totalDistance - forward);
  }
}
