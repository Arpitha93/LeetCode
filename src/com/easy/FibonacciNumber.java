package com.easy;

public class FibonacciNumber {
    public int fib(int N) {
        if (N == 0)
            return 0;
        if (N == 1)
            return 1;
        else
            return fib(N-1) + fib(N-2);

        //iterative

        if (N <= 1)
            return N;
        int fib = 1;
        int prevFib = 1;
        for (int i = 2; i < N; i++) {
            int temp = fib;
            fib = prevFib;
            prevFib = temp;
        }
        return fib;
    }
}