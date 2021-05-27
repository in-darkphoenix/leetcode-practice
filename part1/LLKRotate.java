package part1;

public class LLKRotate {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode ll = new ListNode(0);
        ll.next = head;
        ListNode oldTail = ll;
        ListNode newTail = ll;
        int l = 0; // for size of ll

        while (oldTail.next != null) { // size of ll and oldTail point to tail of ll
            oldTail = oldTail.next;
            l++;
        }

        for (int j = 0; j < l - (k % l); j++) // newTail is the rotated ll's tail
            newTail = newTail.next;

        // new rotated linked list
        oldTail.next = head;
        ll.next = newTail.next;
        newTail.next = null;

        return ll.next;
    }

}
