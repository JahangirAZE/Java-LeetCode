class Solution {
  public int countNodes(TreeNode root) 
  {
    int leftDepth = leftDepth(root);
    int rightDepth = rigthDepth(root);
    if (rightDepth == leftDepth) return (int) Math.pow(2, leftDepth) - 1;
    else return 1 + countNodes(root.left) + countNodes(root.right);
  }
  
  private int rightDepth(TreeNode root)
  {
    int d = 0;
    while (root != null)
    {
      root = root.right;
      d++;
    }
    return d;
  }
  
  private int leftDepth(TreeNode root)
  {
    int d = 0;
    while (root != null)
    {
      root = root.left;
      d++;
    }
    return d;
  }
}
