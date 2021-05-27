package part1;

// https://leetcode.com/problems/remove-duplicates-from-sorted-list/

public class LLREmDup {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode ll = new ListNode();
        ll = head;

        while (ll.next != null) {
            if (ll.val == ll.next.val) {
                ll.next = ll.next.next;
            } else {
                ll = ll.next;
            }
        }
        return head;
    }
}
