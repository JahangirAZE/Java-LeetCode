class Solution {
  public int findSecondMinimumValue(TreeNode root)
  {
    Set<Integer> hashset = new HashSet<>();
    dfs(root, hashset);
    int min1 = root.val;
    long min2 = Long.MAX_VALUE;
    for (int num : hashset)
    {
      if (min1 < num && num < min2) min2 = num;
    }
    return min2 < Long.MAX_VALUE ? (int) min2 : -1;
  }

  private void dfs(TreeNode node, Set<Integer> hashset)
  {
    if (node != null)
    {
      hashset.add(node.val);
      dfs(node.left, hashset);
      dfs(node.right, hashset);
    }
  }
}
