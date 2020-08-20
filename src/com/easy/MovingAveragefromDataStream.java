package com.easy;

import java.util.Deque;
import java.util.LinkedList;

public class MovingAveragefromDataStream {
    private Deque<Integer> deque;
    private int window;
    private double sum;

    public void MovingAverage(int size) {
        deque = new LinkedList<>();
        window = size;
        sum = 0;
    }

    public double next(int val) {
        sum -= deque.size() == window ? deque.poll() : 0;
        deque.offer(val);
        sum += val;
        return sum / Math.min(deque.size(), window);
    }
}