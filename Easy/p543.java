class Solution {
  int diameter = 0;
  public int diameterOfBinaryTree(TreeNode root) {
    if(root == null) return 0;
    helper(root);
    return diameter;
  }
  public int helper(TreeNode root)
  {
    if(root == null) return 0;
    int l = helper(root.left);
    int r = helper(root.right);
    diameter = Math.max(diameter, l + r);
    return 1 + Math.max(l, r);
  }
}
