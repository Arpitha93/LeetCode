package com.medium;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabel {
    public List<Integer> partitionLabel(String S) {
        if (S == null || S.length() == 0)
            return null;

        List<Integer> partitionLabel = new ArrayList<>();
        int[] last_index = new int[26];
        for (int i  = 0; i  < S.length(); i++) {
            last_index[S.charAt(i) - 'a'] = i;
        }
        int start = 0, end = 0;
        for (int i = 0; i < S.length(); i++) {
            end = Math.max(end, last_index[S.charAt(i) - 'a']);

            if (end == i) {
                partitionLabel.add(end - start + 1);
                start = end + 1;
            }
        }
        return partitionLabel;
    }

}