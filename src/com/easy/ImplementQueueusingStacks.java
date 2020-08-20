package com.easy;

import java.util.Stack;

public class ImplementQueueusingStacks {
    Stack<Integer> oldStack = new Stack<>();
    Stack<Integer> newStack = new Stack<>();

    public void push(int x) {
        if (newStack.isEmpty())
            newStack.push(x);
        else {
            while (!newStack.isEmpty()) {
                oldStack.push(newStack.pop());
            }
            oldStack.push(x);

            while (!oldStack.isEmpty()) {
                newStack.push(oldStack.pop());
            }
        }
    }

    public int pop() {
        return newStack.pop();
    }

    public int peek() {
        return newStack.peek();
    }

    public boolean empty() {
        return newStack.isEmpty();
    }
}