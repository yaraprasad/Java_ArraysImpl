package com.java.arrays;

public class BinarySearchProblem {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,7,8,9,10};

        int out= doBinarySearch(nums,6);
        System.out.println(out);

        int out2= doBinarySearch(nums,9);
        System.out.println(out2);
    }

    public static int doBinarySearch(int[] arr,int target){

        int left=0,right=arr.length-1;
        while (left <= right){
            int mid = (left+right)/2;

            if (arr[mid]==target)
                return mid;
            else if (arr[mid] < target)
                left = mid+1;
            else
                right = mid-1;

        }
        return -1;
    }
}
