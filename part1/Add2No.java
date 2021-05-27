package part1;

//import part1.ListNode;

public class Add2No {
    // https://leetcode.com/problems/add-two-numbers/

    public static void main(String[] args) {
        System.out.println("Test for Add 2 number");
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode ll = new ListNode();
        ListNode head = ll;
        while (l1 != null || l2 != null) {
            ListNode ln = new ListNode();
            int ls = 0;
            if (l1 == null) {
                ls = carry + l2.val;
                ln.val = ls % 10;
                carry = ls / 10;
                l2 = l2.next;
                ll.next = ln;
                ll = ln;

            } else if (l2 == null) {
                ls = carry + l1.val;
                ln.val = ls % 10;
                carry = ls / 10;
                l1 = l1.next;
                ll.next = ln;
                ll = ln;

            } else {
                ls = carry + l1.val + l2.val;
                ln.val = ls % 10;
                carry = ls / 10;
                l1 = l1.next;
                l2 = l2.next;
                ll.next = ln;
                ll = ln;
            }
        }
        if (carry != 0) {
            ll.next = new ListNode(carry);
        }
        return head.next;
    }
}
