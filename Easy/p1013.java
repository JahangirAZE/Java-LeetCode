class Solution {
  public boolean canThreePartsEqualSum(int[] arr) {
    int sum = 0;
    for (int i : arr)
    {
      sum += i;
    }
    if (sum % 3 != 0) return false;
    
    int part = 0, count = 0;
    int average = sum / 3;
    for (int i = 0; i < arr.length; i++)
    {
      part += arr[i];
      if (part == average)
      {
        part = 0;
        count++;
        if (count == 2 && i < arr.length - 1) return true;
      }
    }
    return false;
  }
}
