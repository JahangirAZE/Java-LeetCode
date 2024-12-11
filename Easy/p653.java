class Solution {
  public boolean findTarget(TreeNode root, int k) {
    Set<Integer> hashset = new HashSet<>();
    return helper(root, k, hashset);
  }
  private boolean helper(TreeNode root, int k, Set<Integer> hashset)
  {
    if (root == null) return false;
    if (hashset.contains(k - root.val)) return true;
    hashset.add(root.val);
    return helper(root.left, k, hashset) || helper(root.right, k, hashset);
  }
}
