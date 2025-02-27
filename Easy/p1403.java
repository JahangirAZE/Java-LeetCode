class Solution {
  public List<Integer> minSubsequence(int[] nums) {
    int[] freq = new int[101];
    int sum = 0;
    for (int i : nums)
    {
      sum += i;
      freq[i]++;
    }
      
    List<Integer> list = new ArrayList<>();
    int current = 0;
    for (int i = freq.length - 1; i >= 0; i--)
    {
      while (freq[i]-- > 0)
      {
        current += i;
        list.add(i);
        if (2*current > sum) return list;
      }
    }
    return list;
  }
}
