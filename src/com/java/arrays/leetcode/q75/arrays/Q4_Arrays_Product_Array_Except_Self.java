package com.java.arrays.leetcode.q75.arrays;

import java.util.Arrays;

public class Q4_Arrays_Product_Array_Except_Self {

    //Q1 nums=[1,2,3,4] return [24,12,8,6];
    //Q2 nums=[-1,1,0,-3,3] return [0,0,9,0,0];
    public static void main(String[] args) {

        int[] nums1 = {1,2,3,4};
        int[] out1 = productExceptSelf(nums1);

        int[] nums2 = {-1,1,0,-3,3};
        int[] out2= productExceptSelf(nums2);

    }

    public static  int[] productExceptSelf(int[] nums){
        int n= nums.length;
        int[] result = new int[n];

        //step1: Prefix products
        result[0]=1;
        for (int i = 1; i < n; i++) {
            result[i]= result[i-1]* nums[i-1];
        }
        System.out.println("Prefix Products "+ Arrays.toString(result));
        //For input 1 --> Prefix Products [1, 1, 2, 6]
        //For input 2 --> Prefix Products [1, -1, -1, 0, 0]
        //Step2 : suffix products
        int rightProduct=1 ;
        for (int i = n-1; i >=0 ; i--) {
            result[i] = result[i]* rightProduct;
            rightProduct= rightProduct* nums[i];
        }
        System.out.println("Output"+ Arrays.toString(result));
        return result;
    }
}
