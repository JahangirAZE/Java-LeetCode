public class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode() {}
  TreeNode(int val) { this.val = val; }
  TreeNode(int val, TreeNode left, TreeNode right) {
      this.val = val;
      this.left = left;
      this.right = right;
  }
}

class Solution {
  public int minDepth(TreeNode root)
  {
    if (root == null) return 0;
    int depth = 1;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty())
    {
      int size = queue.size();
      for (int i = 0; i < size; i++)
      {
        TreeNode current = queue.poll();
        if (current.left == null && current.right == null) return depth;
        if (current.left == null) queue.add(current.right);
        if (current.right == null) queue.add(current.left);
      }
      depth++;
    }
    return depth;
  }
}
