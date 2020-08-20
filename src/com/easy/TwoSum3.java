package com.easy;

import java.util.ArrayList;
import java.util.Collections;

public class TwoSum3 {

    /** Initialize your data structure here. */
    ArrayList<Integer> arr = new ArrayList<Integer>();
    public void TwoSum() {
        arr = new ArrayList<Integer>();
    }

    /** Add the number to an internal data structure.. */
    public void add(int number) {
        arr.add(number);
    }

    /** Find if there exists any pair of numbers which sum is equal to the value. */
    public boolean find(int value) {
        Collections.sort(arr);

        int i = 0;
        int j = arr.size() - 1;
        while(i<j){
            int sum = arr.get(i) + arr.get(j);
            if(sum == value)
                return true;
            else if(sum > value)
                j--;
            else
                i++;
        }
        return false;
    }
}