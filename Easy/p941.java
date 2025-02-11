class Solution {
  public boolean validMountainArray(int[] arr) {
    if (arr.length < 3) return false;
    int L = arr.length;
    int index = 0;

    while (index < L - 1 && arr[index] < arr[index + 1]) 
    {
      index++;
    }
    if (index == 0 || index == L - 1) return false;

    while (index < L - 1 && arr[index] > arr[index + 1]) 
    {
      index++;
    }
    return index == L - 1;
  }
}
