class Solution {
  public List<Integer> preorderTraversal(TreeNode root) 
  {
    List<Integer> result = new ArrayList<Integer>();
    preOrder(root, result);
    return result;
  }
  
  public void preOrder(TreeNode root, List<Integer> result)
  {
    if(root == null) return;
    if(root != null) result.add(root.val);
    preOrder(root.left, result);
    preOrder(root.right, result);
  }
}
