public class Solution {
  public ListNode getIntersectionNode(ListNode headA, ListNode headB)
  {
    ListNode p = headA;
    ListNode q = headB;
    if (p == null || q == null) return null;
    while (p != q)
    {
      p = (p != null) ? p.next : headB;
      q = (q != null) ? q.next : headA;
    }
    return p;
  }
}
