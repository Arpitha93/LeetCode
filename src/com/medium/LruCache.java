package com.medium;

import java.util.HashMap;

public class LruCache {
    HashMap<Integer, Node> lru;
    Node head = new Node();
    Node tail = new Node();
    int cache_capacity;

    public LRUCache(int capacity) {
        lru = new HashMap<>(capacity);
        this.cache_capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }


    public int get(int key) {
        int result = -1;
        Node node = lru.get(key);
        if (node != null) {
            remove(node);
            add(node);
            result = node.val;
        }
        return  result;
    }

    public void put(int key, int value) {
        Node node = lru.get(key);
        if (node != null) {
            remove(node);
            node.val = value;
            add(node);
        } else {
            if (lru.size() == cache_capacity) {
                lru.remove(tail.prev.key);
                remove(tail.prev);
            }

            Node new_node = new Node();
            new_node.key = key;
            new_node.val = value;

            lru.put(key, new_node);
            add(new_node);
        }
    }

    public void add(Node node) {
        node.next = head.next;
        node.prev.next = node.prev;
        head.next = node;
        node.prev = head;
    }

    public void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
        node.next = null;
        node.prev = null;
    }

    public class Node {
        int key;
        int val;
        Node next;
        Node prev;
    }

}