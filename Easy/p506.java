class Solution {
  public String[] findRelativeRanks(int[] score) {
    int N = score.length;
    String[] result = new String[N];
    Map<Integer, Integer> hashmap = new HashMap<>();
    for (int i = 0; i < N; i++)
    {
      hashmap.put(score[i], i);
    }
    Arrays.sort(score);

    for (int i = 0; i < N; i++)
    {
      int rank = N - i;
      int originalIndex = hashmap.get(score[i]);
      if (rank == 1) result[originalIndex] = "Gold Medal";
      else if (rank == 2) result[originalIndex] = "Silver Medal";
      else if (rank == 3) result[originalIndex] = "Bronze Medal";
      else result[originalIndex] = String.valueOf(rank);
    }
    return result;
  }
}
