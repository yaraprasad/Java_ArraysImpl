package com.java.arrays;

public class SecondMinimumElement {
    public static void main(String[] args) {
        int[] a = {50,10,33,40,26,23,67,28,89,99,6};
        int min1=0, min2=0;
        if(a[0] < a[1]){
            min1 = a[0];
            min2 = a[1];
        }else {
            min1 = a[1];
            min2 = a[0];
        }
        for (int i = 2; i < a.length; i++) {
            if(a[i]< min1){
                min2=min1;
                min1=a[i];
            }else if (a[i]<min2){
                min2=a[i];
            }
            
        }
        System.out.println(min1);
        System.out.println(min2);
    }
}
