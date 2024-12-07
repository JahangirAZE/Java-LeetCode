class Solution {
  public boolean isSubtree(TreeNode root, TreeNode subRoot) {
    String mainTree = preOrderTraversal(root);
    String subTree = preOrderTraversal(subRoot);
    return mainTree.contains(subTree);
  }
  private String preOrderTraversal(TreeNode node)
  {
    if (node == null) return "null";
    StringBuilder sb = new StringBuilder("^");
    sb.append(node.val);
    sb.append(preOrderTraversal(node.left));
    sb.append(preOrderTraversal(node.right));
    return sb.toString();
  }
}
