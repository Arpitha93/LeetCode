package com.medium;

import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class CopyListWithRandomPtr {
    public Node copyRandomList (Node head){
        HashMap<Node, Node> hm = new HashMap<>();

        for (Node oldList = head; oldList != null; oldList = oldList.next){
            Node newList = new Node(oldList.val);
            hm.put(oldList, newList);
        }

        for (Node oldList = head; oldList != null; oldList = oldList.next){
            Node cur = hm.get(oldList);
            cur.next = hm.get(oldList.next);
            cur.random = hm.get(oldList.random);
        }

        return hm.get(head);
    }
}