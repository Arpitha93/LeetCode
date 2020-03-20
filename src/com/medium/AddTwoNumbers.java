package com.medium;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode head = l3;
        int carry = 0;

        while(l1 != null && l2 != null){
            int digits = (l1.val + l2.val + carry) % 10;
            carry = (l1.val + l2.val + carry) / 10;
            ListNode newNode = new ListNode(digits);
            l3.next = newNode;
            l3 = newNode;
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null){
            int digits = (l1.val +  carry) % 10;
            carry = (l1.val + carry) / 10;
            ListNode newNode = new ListNode(digits);
            l3.next = newNode;
            l3 = newNode;
            l1 = l1.next;
        }

        while(l2 != null){
            int digits = (l2.val + carry) % 10;
            carry = ( l2.val + carry) / 10;
            ListNode newNode = new ListNode(digits);
            l3.next = newNode;
            l3 = newNode;
            l2 = l2.next;
        }

        if(carry != 0){
            ListNode newNode = new ListNode(carry);
            l3.next = newNode;
            l3 = newNode;
        }

        return head.next;

    }
}