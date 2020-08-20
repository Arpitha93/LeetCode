package com.easy;

public class LinkedListCycle {
     class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
          }
      }

    public boolean hasCycle(ListNode head) {
         if(head == null || head.next == null)
             return false;

        ListNode front = head;
        ListNode tail = head;

        while(front != null && front.next != null){
            front = front.next.next;
            tail = tail.next;
            if(front == tail){
                return true;
            }
        }
        return false;

    }
}