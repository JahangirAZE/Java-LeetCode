class Solution {
  public double trimMean(int[] arr) {
    Arrays.sort(arr);
    int offset = arr.length / 20;
    int sum = 0;
    for (int i = offset; i < arr.length - offset; i++)
    {
      sum += arr[i];
    }
    return (double) sum / (arr.length - 2*offset);
  }
}
