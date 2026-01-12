package com.java.arrays;

public class SecondLargestElement {
    public static void main(String[] args) {

        int[] a = {50,10,33,40,26,23,67,28,89,99};

        int max1=0, max2=0;
        if (a[0] > a[1]){
            max1 = a[0];
            max2 = a[1];
        }else{
            max1 = a[1];
            max2 = a[0];
        }

        for(int i=2 ;i<a.length;i++){
            if(a[i] > max1){
                max2= max1;
                max1= a[i];
            }else if(a[i] > max2){
                max2= a[i];
            }
        }
        System.out.println(max2); //89
    }
}
