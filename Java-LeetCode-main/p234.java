class Solution {
  public boolean isPalindrome(ListNode head)
  {
    if (head == null || head.next == null) return true;

    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null)
    {
      fast = fast.next.next;
      slow = slow.next;
    }
    if (fast != null) slow = slow.next;
    slow = reverseList(slow);
    fast = head;

    while (slow != null)
    {
      if (fast.val != slow.val) return false;
      fast = fast.next;
      slow = slow.next;
    }
    return true;
  }

  private ListNode reverseList(ListNode head)
  {
    ListNode prev = null;
    while (head != null)
    {
      ListNode nextTemp = head.next;
      head.next = prev;
      prev = head;
      head = nextTemp;
    }
    return prev;
  }
}
