package com.easy;

import java.util.ArrayList;
import java.util.List;

public class DesignHashMap {
    List<HashNode> buckets;
    int numBuckets;

    public MyHashMap() {
        buckets = new ArrayList<HashNode>();
        numBuckets = 10000;

        for (int i = 0; i<numBuckets; i++)
            buckets.add(null);
    }

    public int getBucketIndex(int key) {
        return Integer.hashCode(key) % numBuckets;
    }

    public void put(int key, int value) {
        int bucketIndex = getBucketIndex(key);
        HashNode node = buckets.get(bucketIndex);
        while (node != null) {
            if (node.key == key) {
                node.value = value;
                return;
            }
            node = node.next;
        }

        bucketIndex = getBucketIndex(key);
        HashNode newNode = new HashNode(key,value);
        newNode = node.next;
        buckets.set(bucketIndex, newNode);
    }

    public int get(int key) {
        int bucketIndex = getBucketIndex(key);
        HashNode node = buckets.get(bucketIndex);
        while (node != null) {
            if (node.key == key)
                return node.value;
        }
        node = node.next;
        return -1;
    }

    public void remove(int key) {
        int bucketIndex = getBucketIndex(key);
        HashNode node = buckets.get(bucketIndex);
        HashNode prev = null;
        while (node != null) {
            if (node.key == key)
                break;

            prev = node;
            node = node.next;
        }

        if (node == null)
            return;

        if (prev != null) {
            prev.next = node.next;
        } else {
            buckets.set(bucketIndex, node.next);
        }
    }

    public class HashNode {
        int key;
        int value;

        HashNode next;

        HashNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}

