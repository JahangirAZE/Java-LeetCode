class Solution {
  public int tribonacci(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;
    if (n == 2) return 1;
    int[] dp = {0, 1, 1};
    for (int i = 0; i < n - 2; i++)
    {
      int dp2 = dp[0] + dp[1] + dp[2];
      dp[0] = dp[1];
      dp[1] = dp[2];
      dp[2] = dp2;
    }
    return dp[2];
  }
}
