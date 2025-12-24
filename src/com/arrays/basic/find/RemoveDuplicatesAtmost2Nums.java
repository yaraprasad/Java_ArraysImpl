package com.arrays.basic.find;

import java.util.Arrays;

public class RemoveDuplicatesAtmost2Nums {
    //Removes all duplicates from a sorted list such that each element apperas at most twice.
    // input --> output
   // [1,1,1,2,2,3] -->[1,1,2,2,3]
    //[0,0,1,1,1,1,2,3,3] --> [0,0,1,1,2,3,3]

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums) {
            if (i < 2 || n != nums[i - 2]) {
                //System.out.println(i+" index and n: "+n +" nums[i-2] :"+ nums[i - 2]);
                nums[i] = n;
                i++;
            }
        }
        return i; // length of modified array
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        int len = removeDuplicates(arr);
        System.out.printf("Case 1: ");
        System.out.println("input: "+Arrays.toString(arr)+" output: " + Arrays.toString(Arrays.copyOf(arr, len)));

        int[] arr1 = {0,0,1,1,1,1,2,3,3};
        int len1 = removeDuplicates(arr1);
        System.out.printf("Case 2: ");
        System.out.println("input: "+Arrays.toString(arr1)+" output: " + Arrays.toString(Arrays.copyOf(arr1, len1)));

    }
}
