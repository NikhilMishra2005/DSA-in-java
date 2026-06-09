class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Step 1: Create a dummy node to act as the foundation
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // Step 2: Traverse both lists while they are not null
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // Step 3: If one list is longer, append the remaining nodes
        if (list1 != null) {
            current.next = list1;
        } else if (list2 != null) {
            current.next = list2;
        }

        // Return the head (which is the node after dummy)
        return dummy.next;
    }
}