class Solution {
  public boolean isUnivalTree(TreeNode root) {
    if (root == null) return false;
    return traverse(root, root.val);
  }
  private boolean traverse(TreeNode root, int value) {
    if (root == null) return true;
    if (root.val != value) return false;
    return traverse(root.right, value) && traverse(root.left, value);
  }
}
