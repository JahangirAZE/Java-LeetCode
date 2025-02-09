class Solution {
  public int minCostClimbingStairs(int[] cost) {
    int length = cost.length;
    int[] dp = new int[length];
    dp[0] = cost[0];
    dp[1] = cost[1];
  
    for (int i = 2; i < length; i++) 
    {
      dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
    }
    return Math.min(dp[length - 1], dp[length - 2]);
  }
}
