class Solution {
  private int result;
  public int findTilt(TreeNode root) {
    if (root == null) return 0;
    dfs(root);
    return result;
  }
  private int dfs(TreeNode root)
  {
    if (root == null) return 0;
    int leftSum = dfs(root.left);
    int rightSum = dfs(root.right);
    result += Math.abs(leftSum - rightSum);
    return leftSum + rightSum + root.val;
  }
}
