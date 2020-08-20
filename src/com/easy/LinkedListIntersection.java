package com.easy;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
public class LinkedListIntersection {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA == null && headB == null)
            return null;

        Result result1 = getTailAndSize(headA);
        Result result2 = getTailAndSize(headB);

        if (result1.tail != result2.tail )
            return null;

        ListNode longer = result1.size < result2.size ? headB : headA;
        ListNode shorter = result1.size < result2.size ? headA : headB;

        longer = getKthNode(longer, Math.abs(result1.size - result2.size ));

        while (shorter != longer){
            shorter = shorter.next;
            longer = longer.next;
        }
        return longer;

    }

    ListNode getKthNode(ListNode head, int k) {
        ListNode current = head;
        while (k>0 && current!= null){
            current = current.next;
            k--;
        }
        return  current;

    }

    class Result{
        public ListNode tail;
        public int size;

        public Result(ListNode tail, int size) {
            this.tail = tail;
            this.size = size;
        }
    }

    Result getTailAndSize(ListNode head) {
        if (head == null)
            return null;

        int size = 1;
        ListNode current = head;
        while (current.next != null){
            size++;
            current = current.next;
        }
        return new Result(current, size);

    }

}