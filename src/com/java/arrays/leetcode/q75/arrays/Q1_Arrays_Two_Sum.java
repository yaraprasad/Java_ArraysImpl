package com.java.arrays.leetcode.q75.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class Q1_Arrays_Two_Sum {

    //Given nums = [2,7,11,15] , target =9;

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};//, target = 9
        int[] out = new int[2];
        int target =9;
        /*for(int i=0; i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(target==(arr[i]+arr[j])){
                    System.out.println(i+" iteration for index "+j);
                    out[0]=i; out[1]=j;
                }
            }
        } // O(n^2)*/

      //System.out.println(Arrays.toString(out));
        // Arrays.stream(out).forEach(System.out::println);


        //Given nums = [2,7,11,15] , target =9;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
             if(map.containsKey(complement)){
                  out= new int[]{map.get(complement), i};
             }
             map.put(arr[i],i);
        }
        System.out.println(Arrays.toString(out));
    }


}
