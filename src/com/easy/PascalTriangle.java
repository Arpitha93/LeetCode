package com.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows == 0)
            return result;

//        for(int i=0; i<numRows; i++){
//            List<Integer> sum = new ArrayList<>();
//            if (i == 1)
//                sum.add(1);
//            else if (i == 2){
//                sum.add(1);
//                sum.add(1);
//            }
//            else {
//                for (int j=1; j<sum.size()-1; j++)
//                   // sum.add(result.get(i-1).get(j-1)+ result.get(i-1).get(j));
//                sum.add(result.get(i).get(j) + result.get(i).get(j-1));
//                sum.add(1);
//
//            }
//            result.add(sum);

        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        result.add(first_row);

        for(int i=1; i<numRows; i++) {
            List<Integer> prev_row = result.get(i - 1);
            List<Integer> row = new ArrayList<>();
            row.add(1);

            for (int j=1; j<i; j++){
                row.add(prev_row.get(j-1) + prev_row.get(j));

        }

        row.add(1);
            result.add(row);
        }
        return result;

    }
}