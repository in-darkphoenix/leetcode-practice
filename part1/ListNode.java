package part1;

// https://leetcode.com/problems/merge-two-sorted-lists/

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;

        if (l2 == null)
            return l1;

        ListNode ll = new ListNode(-1);
        ListNode head = ll;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                ll.next = l1;
                l1 = l1.next;
            } else {
                ll.next = l2;
                l2 = l2.next;
            }

            ll = ll.next;
        }

        ll.next = l1 == null? l2:l1;

        return head.next;

    }
}
