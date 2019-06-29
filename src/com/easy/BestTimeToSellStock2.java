package com.easy;

public class BestTimeToSellStock2 {
    public int maxProfit(int[] prices) {
//        int sum = 0;
//        for (int i = 0; i<prices.length-1; i++){
//            if (prices[i] < prices[i+1])
//                sum += prices[i+1] - prices[i];
//
//        }
//
//        return sum;

        int profit = 0;
        int buy = 0;
        if (prices == null && prices.length == 0)
            return 0;

        for (int i=1; i<prices.length; i++){
            if (prices[i] >= prices[i-1])
                continue;

            else
                profit += prices[i-1] - prices[buy];
            buy = i;

        }
        int preProfit = prices[prices.length - 1] - prices[buy];
        profit += preProfit > 0 ? preProfit : 0;

        return profit;

    }
}