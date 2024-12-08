class Solution {
  public List<Integer> postorder(Node root) {
    List<Integer> list = new ArrayList<>();
    postorderTraversal(root, list);
    return list;
  }

  private void postorderTraversal(Node node, List<Integer> list)
  {
    if (node == null) return;
    for (Node child : node.children)
    {
      postorderTraversal(child, list);
    }
    list.add(node.val);
  }
}
