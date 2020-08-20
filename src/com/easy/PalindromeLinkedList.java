package com.easy;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
//        Stack<Integer> stack = new Stack<Integer>();
//        ListNode slow = head;
//
//        if (head == null)
//            return  true;
//
//        while(slow != null){
//            stack.push(slow.val);
//            slow = slow.next;
//        }
//
//        while (head != null){
//            int i = stack.pop();
//            if (head.val == i)
//                return true;
//
//            head = head.next;
//
//        }
//
//        return  false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode reverse = reverseList(slow);
        slow = head;
        while (slow != null && reverse != null) {
            if (slow.val != reverse.val) {
                return false;
            }
            slow = slow.next;
            reverse = reverse.next;
        }
        return true;
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

}