class Solution {
  Integer prev = null;
  int count = 1;
  int max = 0;
  public int[] findMode(TreeNode root) {
    List<Integer> modes = new ArrayList<>();
    traverse(root, modes);
    return modes.stream().mapToInt(i -> i).toArray();
  }
  
  public void traverse(TreeNode root, List<Integer> modes)
  {
    if (root == null) return;
    traverse(root.left, modes);
    if (prev != null)
    {
      if (prev == root.val) count++;
      else count = 1;
    }
    if (count > max)
    {
      max = count;
      modes.clear();
      modes.add(root.val);
    }
    else if (count == max) modes.add(root.val);
    
    prev = root.val;
    traverse(root.right, modes);
  }
}
