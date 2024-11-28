class Solution {
  public ListNode reverseList(ListNode head)
  {
    Stack<ListNode> stack = new Stack<>();
    while (head != null)  
    {
      stack.push(head);
      head = head.next;
    }

    ListNode dummy = new ListNode(0);
    ListNode current = dummy;
    while (!stack.isEmpty())
    {
      current.next = stack.pop();
      current = current.next;
    }
    current.next = null;

    return dummy.next;
  }
}
