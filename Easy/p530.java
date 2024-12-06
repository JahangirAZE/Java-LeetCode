class Solution {
  private Integer prev = null;
  private int minDiff = Integer.MAX_VALUE;

  public int getMinimumDifference(TreeNode root)
  {
    traverse(root);
    return minDiff;
  }
  public void traverse(TreeNode node)
  {
    if (node == null) return;
    traverse(node.left);
    if (prev != null) minDiff = Math.min(minDiff, Math.abs(node.val - prev));
    prev = node.val;
    traverse(node.right);
  }
}
