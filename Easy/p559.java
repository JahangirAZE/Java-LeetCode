class Solution {
  int depth = 0;
  public int maxDepth(Node root) {
    if (root == null) return 0;
    depth = dfs(root);
    return depth;
  }
  private int dfs(Node root)
  {
    if (root == null) return 0;
    int maxDepth = 0;
    for (Node node : root.children)
    {
      maxDepth = Math.max(maxDepth, dfs(node));
    }
    return 1 + maxDepth;
  }
}
