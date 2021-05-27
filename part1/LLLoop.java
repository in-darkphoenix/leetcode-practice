package part1;
// https://leetcode.com/problems/linked-list-cycle/

public class LLLoop {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;

        while (head != null) {
            if (head.val == 100001)
                return true;
            else {
                head.val = 100001;
                head = head.next;
            }
        }
        return false;
    }

    public boolean hasCycleN(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow.val == fast.val)
                return true;
        }
        return false;
    }
}
