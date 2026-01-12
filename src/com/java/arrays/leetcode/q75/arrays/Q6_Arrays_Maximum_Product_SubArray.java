package com.java.arrays.leetcode.q75.arrays;

public class Q6_Arrays_Maximum_Product_SubArray {
    public static void main(String[] args) {

        //Q1 input [2,3,-2,4] output 6
        //Explanation [2,3] has the largest product 6.
        int[] nums= {2,3,-2,4,-5};
        int max_p = nums[0];
        int min_p = nums[0];
        int maxProduct =max_p;
        for (int i = 1; i < nums.length; i++) {
            int temp_prod = min_p;
            min_p = Math.min(nums[i],Math.min(nums[i]*min_p,nums[i]*max_p));
            max_p = Math.max(nums[i],Math.max(nums[i]*temp_prod,nums[i]*max_p));
            maxProduct= Math.max(max_p,maxProduct);
        }
        System.out.println(maxProduct);
    }
}
