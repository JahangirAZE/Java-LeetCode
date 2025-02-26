class Solution {
  public int[] sortByBits(int[] arr) {
    Integer newArr[] = new Integer[arr.length];
    for(int i = 0; i < arr.length; i++) 
    {
      newArr[i] = arr[i];
    }

    Arrays.sort(newArr, (a, b) -> {
      int onesA = Integer.bitCount(a);
      int onesB = Integer.bitCount(b);
      return onesA == onesB ? Integer.compare(a, b) : Integer.compare(onesA, onesB);
    });
    
    for(int i = 0; i < arr.length; i++) 
    {
      arr[i] = newArr[i];
    }
    return arr;
  }
}
