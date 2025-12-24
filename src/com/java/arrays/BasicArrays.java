package com.java.arrays;

import java.util.Arrays;
import java.util.List;

public class BasicArrays {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("India","Pakistan");

        for (String str: list){
            System.out.println(str);
        }
    }
}
