package com.easy;

public class BestTimeToBuySellStocks {

    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = Integer.MIN_VALUE;
//        int buy = 0;
//        int sell = 0;
//        int profit = 0;
//        for(int i = 1; i<prices.length; i++) {
//            if (prices[i] < buy)
//                buy = prices[i];
//
//            if(prices[i] > sell)
//                sell = prices[i];
//
//
//            profit = Math.max(profit, sell - buy);
//        }
//        return  profit;

        for(int i = 0; i<prices.length; i++) {
            if (prices[i] < min)
                min = prices[0];

            if(profit > prices[i])
                profit = prices[i] - min;

//            profit = Math.max(profit, sell - buy);
        }
        return  profit;



//        for (int i = 0; i<prices.length; i++) {
//            if (prices[i] > min) {
//                res = Math.max(res, prices[i] - min);
//            }
//            min = Math.min(prices[i], min);
//        }
//        return min;

    }
}