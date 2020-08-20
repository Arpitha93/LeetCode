package com.easy;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {
    public boolean happyList(List<Integer> list, int n) {

        list.add(n);
        int ans = 0;

        while (n > 0){
            int rem = n % 10;
            n /= 10;
            ans += Math.pow(rem, 2);

        }
        if(ans == 1)
            return true;
        else if(list.contains(ans))
            return false;
        else
            return happyList(list, ans);
    }

    public boolean isHappy(int n) {
        List<Integer> list = new ArrayList<Integer>();
        return happyList(list, n);
    }
}