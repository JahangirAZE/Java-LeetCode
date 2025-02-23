class Solution {
  public boolean checkIfExist(int[] arr) {
    Set<Integer> hashset = new HashSet<>();
    for (int i : arr)
    {
      if (hashset.contains(i * 2) || (i % 2 == 0 && hashset.contains(i / 2))) return true;
      hashset.add(i);
    }
    return false;
  }
}
