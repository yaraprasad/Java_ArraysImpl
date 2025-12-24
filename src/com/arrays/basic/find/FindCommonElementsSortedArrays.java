package com.arrays.basic.find;

public class FindCommonElementsSortedArrays {

    public static void main(String[] args) {

        //write a java program to find the common numbers from 2 sorted arrays.

        int[] a= {10,20,30,50,80};
        int[] b = {20,35,80,90};

        int i=0,j=0;
        while(i < a.length && j< b.length){
            if(a[i]==b[j]){
                System.out.println(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else{
                j++;
            }
        }//close while loop
        //output :: 20, 80 (common elements from 2 sorted arrays)
    }
}
