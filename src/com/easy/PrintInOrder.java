package com.easy;

import java.util.concurrent.atomic.AtomicInteger;

public class PrintInOrder {
    private AtomicInteger first = new AtomicInteger(0);
    private AtomicInteger second = new AtomicInteger(0);

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        first.incrementAndGet();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (first.get() != 1) {

        }
        printSecond.run();
        second.incrementAndGet();
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (second.get() != 1) {

        }
        printThird.run();
    }
}