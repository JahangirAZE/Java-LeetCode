class Solution {
  public void duplicateZeros(int[] arr) {
    List<Integer> list = new ArrayList<>();
    for (int i : arr)
    {
      if (i == 0) list.add(0);
      list.add(i);
    }
    for (int i = 0; i < arr.length; i++)
    {
      arr[i] = list.get(i);
    }
  }
}
