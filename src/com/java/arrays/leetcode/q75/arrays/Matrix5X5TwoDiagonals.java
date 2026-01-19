package com.java.arrays.leetcode.q75.arrays;

public class Matrix5X5TwoDiagonals {

        public static void main(String[] args) {

           int[][] matrix = {
                    {1, 2, 3, 4, 5},
                    {6, 7, 8, 9, 0},
                    {1, 2, 3, 4, 5},
                    {6, 7, 8, 9, 0},
                    {1, 2, 3, 4, 5}
            };
            //7X7 matrix
            /*int[][] matrix = {
                    {1, 2, 3, 4, 5, 6, 7},
                    {6, 7, 8, 9, 0, 1, 2},
                    {1, 2, 3, 4, 5, 6, 7},
                    {6, 7, 8, 9, 0, 1, 2},
                    {1, 2, 3, 4, 5, 6, 7},
                    {6, 7, 8, 9, 0, 1, 2},
                    {1, 2, 3, 4, 5, 6, 7}
            };*/

            printTwoDiagonals(matrix);
        }

        static void printTwoDiagonals(int[][] mat) {
            int n = mat.length;

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (i == j || i + j == n - 1) {
                           // System.out.print(mat[i][j] + " ");
                             System.out.print(" "+i+j);
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
        }

}
