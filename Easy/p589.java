class Solution {
  public List<Integer> preorder(Node root) {
    List<Integer> list = new ArrayList<>();
    preorderTraversal(root, list);
    return list;
  }

  private void preorderTraversal(Node node, List<Integer> list)
  {
    if (node == null) return;
    list.add(node.val);
    for (Node child : node.children)
    {
      preorderTraversal(child, list);
    }
  }
}
