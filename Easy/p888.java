class Solution {
  public int[] fairCandySwap(int[] A, int[] B) {
    int totalA = Arrays.stream(A).sum();
    int totalB = Arrays.stream(B).sum();
    int difference = (totalA - totalB) / 2;

    HashSet<Integer> setB = new HashSet<>();
    for (int b : B) 
    {
      setB.add(b);
    }

    for (int a : A) 
    {
      int target = a - difference;
      if (setB.contains(target)) return new int[] {a, target};
    }
    return new int[] {};
  }
}
