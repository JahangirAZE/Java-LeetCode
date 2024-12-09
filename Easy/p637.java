class Solution {
  public List<Double> averageOfLevels(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    queue.add(null);
    List<Double> averageList = new ArrayList<>();

    while (queue.peek() != null)
    {
      double sum = 0;
      int count = 0;
      while (queue.peek() != null)
      {
        TreeNode node = queue.poll();
        sum += node.val;
        count++;
        if (node.left != null) queue.add(node.left);
        if (node.right != null) queue.add(node.right);
      }
      queue.add(queue.poll());
      averageList.add(sum / count);
    }
    return averageList;
  }
}
