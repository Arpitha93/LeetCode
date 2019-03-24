package com.easy;

public class MergeTwoLists {


      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }


        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

//         ListNode merge = new ListNode(0);

//         while(l1 != null && l2!= null){
//             if(l1.val < l2.val){
//                 merge = l1.next;
//                 l1 = l1.next;
//             }
//             else{
//                 merge = l2.next;
//             l2 = l2.next;
//             }

//           //  merge = merge.next;

//         }


//         return merge.next;

            if(l1 == null)
                return l2;
            if(l2 == null)
                return l1;
            if(l1.val < l2.val){
                l1.next = mergeTwoLists(l1.next, l2);
                return l1;
            }
            else{
                l2.next = mergeTwoLists(l1, l2.next);
                return l2;
            }
        }
    }

