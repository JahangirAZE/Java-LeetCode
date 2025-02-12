class Solution {
  
  private int depthX = -1;
  private int depthY = -1;
  private TreeNode parentX = null;
  private TreeNode parentY = null;

  public boolean isCousins(TreeNode root, int x, int y) {
    findDepthAndParent(root, null, x, y, 0);
    return depthX == depthY && parentX != parentY; 
  }

  private void findDepthAndParent(TreeNode node, TreeNode parent, int x, int y, int depth) {
    if (node == null) return;

    if (node.val == x) 
    {
      depthX = depth;
      parentX = parent;
    } 
    if (node.val == y) 
    {
      depthY = depth;
      parentY = parent;
    }

    findDepthAndParent(node.left, node, x, y, depth + 1);
    findDepthAndParent(node.right, node, x, y, depth + 1);
  }
}
