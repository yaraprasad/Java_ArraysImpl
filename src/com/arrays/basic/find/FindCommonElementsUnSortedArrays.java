package com.arrays.basic.find;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindCommonElementsUnSortedArrays {
    public static void main(String[] args) {
        //write a java program to find the common numbers from 2 unsorted arrays.

        int[] a= {20,10,30,80,50};
        int[] b = {90,35,80,20};

        Set<Integer> set = new HashSet<>();
        //irrespective of hashset and linkedhashset out put is 80,20 no 20,80


        //store elements from first array
        for (int num:a){
            set.add(num);
        }

        //check elements from second array
        for (int num:b){
            if(set.contains(num)){
                System.out.println(num);
                set.remove(num);
            }
            set.add(num);
        }

        //2. alternative ways
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(b));

        Arrays.sort(a);
        Arrays.sort(b);
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(b));

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
        }
    }
}
