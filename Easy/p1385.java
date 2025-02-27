class Solution {
  public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
    int count = 0;
    for (int i = 0; i < arr1.length; i++) 
    {
      if (checkDistance(arr2, arr1[i], d)) count++;
    }
    return count;
  }

  private boolean checkDistance(int[] arr2, int x, int d) {
    for(int i = 0; i < arr2.length; i++) 
    {
      if (Math.abs(x - arr2[i]) <= d) return false;
    }
    return true;
  }
}
