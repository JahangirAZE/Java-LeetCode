class Solution {
  public List<String> binaryTreePaths(TreeNode root)
  {
    List<String> list = new ArrayList<>();
    if (root == null) return list;
    String currentPath = Integer.toString(root.val);
    if (root.left == null && root.right == null) list.add(currentPath);
    if (root.left != null) dfs(root.left, currentPath, list);
    if (root.right != null) dfs(root.right, currentPath, list);
    return list;
  }

  private void dfs(TreeNode root, String currentPath, List list)
  {
    currentPath += "->" + root.val;
    if (root.left == null && root.right == null)
    {
      list.add(currentPath);
      return;
    }
    if (root.left != null) dfs(root.left, currentPath, list);
    if (root.right != null) dfs(root.right, currentPath, list);
  }
}
