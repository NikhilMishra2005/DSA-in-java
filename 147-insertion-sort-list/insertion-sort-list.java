class Solution {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = head;
        ListNode prev = dummy;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;

            while (prev.next != null && prev.next.val < curr.val) {
                prev = prev.next;
            }

            curr.next = prev.next;
            prev.next = curr;
            prev = dummy;
            curr = next;
        }

        return dummy.next;
    }
}