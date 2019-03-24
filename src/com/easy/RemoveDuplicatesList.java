package com.easy;

public class RemoveDuplicatesList {

     // Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }


        public ListNode deleteDuplicates(ListNode head) {
            ListNode cur = head;
            while(cur != null){
                ListNode next = cur.next;
                while(next != null &&  cur.val == next.val){
                    cur.next = next.next;
                    next = next.next;
                }

                cur = cur.next;
            }

            return head;

        }

}