class Solution {
  public int lastStoneWeight(int[] stones) {
    int L = stones.length;
    int lastIndex = L - 1;
    while (L > 1) 
    {
      Arrays.sort(stones);
      stones[lastIndex] -= stones[lastIndex - 1];
      stones[lastIndex - 1] = 0;
      if (stones[lastIndex] == 0) L--;
      L--;
    }
    Arrays.sort(stones);
    return stones[lastIndex];
  }
}
