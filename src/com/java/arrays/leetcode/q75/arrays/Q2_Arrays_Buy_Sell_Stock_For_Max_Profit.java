package com.java.arrays.leetcode.q75.arrays;

public class Q2_Arrays_Buy_Sell_Stock_For_Max_Profit {
    public static void main(String[] args) {

        int[] prices =  {7,1,5,3,6,4};

        int maxProfit = sellStockForMaxProfit(prices);
        System.out.println(maxProfit);
    }

    private static int sellStockForMaxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price: prices){
           if (price<minPrice){
               minPrice=price;
           }else{
               maxProfit= Math.max(maxProfit,price-minPrice);
           }
        }
        return  maxProfit;
    }
}
