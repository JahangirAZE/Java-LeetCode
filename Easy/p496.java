class Solution {
  public int[] nextGreaterElement(int[] nums1, int[] nums2)
  {
    Map<Integer, Integer> hashmap = new HashMap<>();
    Stack<Integer> stack = new Stack<>();
    for (int num : nums2)
    {
      while (!stack.isEmpty() && stack.peek() < num)
      {
        hashmap.put(stack.pop(), num);
      }
      stack.push(num);
    }
    for (int i = 0; i < nums1.length; i++)
    {
      nums1[i] = hashmap.getOrDefault(nums1[i], -1);
    }
    return nums1;
  }
}
