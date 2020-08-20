package com.easy;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueues {
    Queue<Integer> q1;
    Queue<Integer> q2;
    int top = -1;


    public void MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        q1.add(x);
        top = x;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int t;

        while (!q1.isEmpty()){
            t = q1.poll();

        if (q1.size() == 1)
            top = t;

        if (q1.size() == 0) {
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
            return t;
        }
        q2.add(t);
        }
    return -1;

    }

    /** Get the top element. */
    public int top() {
        return top;

    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return  (q1.size() == 0);

    }
}