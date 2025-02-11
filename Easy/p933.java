class RecentCounter {

  private static final int[] records= new int[10000];
  private int start = 0;
  private int end = 0;

  public RecentCounter() {
      
  }
  
  public int ping(int t) {
    while (start < end && (t - records[start] > 3000))
    {
      start++;
    }
    records[end++] = t;
    return end - start;
  }
}
