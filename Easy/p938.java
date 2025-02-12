class Solution {
  
  private int s = 0;
  
  public int rangeSumBST(TreeNode root, int a, int b) {
    if(root != null)
    {
      rangeSumBST(root.left, a, b);
      if (root.val >= a && root.val <= b) s += root.val;
      rangeSumBST(root.right, a, b);
    }
    return s;
  }
}
