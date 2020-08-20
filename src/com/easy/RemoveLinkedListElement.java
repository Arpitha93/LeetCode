package com.easy;

public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

public class RemoveLinkedListElement {
    public ListNode removeElements(ListNode head, int val) {
//        int high = Integer.MAX_VALUE;
//        int low = 0;
//        if (head.val == val){
//            return head;
//        }
//        while (low < high){
//            int mid = (low + high)/2;
//            if(mid == val)
//                return ;
//            else if(val < mid)
//                low++;
//            else
//                high--;
//
//        }
//        return

        while (head != null && head.val == val){
            head = head.next;
        }

//        if(head == head.next)
//            return  null;


        ListNode cur = head;

        while(cur != null && cur.next != null) {
            if(cur.next.val == val) {
                cur.next = cur.next.next;
            }
            else {
                cur = cur.next;
            }
        }
        return head;



    }

}