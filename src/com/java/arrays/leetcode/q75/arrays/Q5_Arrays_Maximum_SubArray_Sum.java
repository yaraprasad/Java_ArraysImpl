package com.java.arrays.leetcode.q75.arrays;

public class Q5_Arrays_Maximum_SubArray_Sum {
    public static void main(String[] args) {

        //Q1 Input [-2,1,-3,4,-1,2,1,-5,4]
        //output 6
        //Explanation [4,-1,2,1] has the largest sum = 6
         int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
         int maxSubArray = nums[0];
         int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (currentSum<0)
                    currentSum=0;
            currentSum=currentSum+nums[i];
            maxSubArray = Math.max(maxSubArray,currentSum);
        }
        System.out.println(" maxSubArray "+maxSubArray);
    }
}
