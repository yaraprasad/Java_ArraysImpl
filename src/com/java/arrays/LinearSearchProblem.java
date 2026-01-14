package com.java.arrays;

public class LinearSearchProblem {

    public static void main(String[] args) {

        int[] a = {50,10,33,40,26};
        int target = 40;

        int out= doLinearSearch(a,target);
        System.out.println(out);

        target = 99;
        int out2= doLinearSearch(a,target);
        System.out.println(out2);

    }
    public static int  doLinearSearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target)
                return i;
        }
        return -1;
    }
}
