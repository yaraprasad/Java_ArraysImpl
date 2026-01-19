package com.java.arrays.matrix;

public class MatrixMultiplication {

    public static void main(String[] args) {
                int[][] mt1={{1,2,3},{4,5,6}};
                int[][] mt2={{7,8},{9,10},{11,12}};
                printMatrix(mt1);
                System.out.println("-------------------------------------");
                printMatrix(mt2);
                System.out.println("-------------------------------------");
                if(mt1[0].length!=mt2.length){
                    System.out.println("Multiplication not possible");
                    System.exit(1);
                }
            System.out.println("Validated for Multiplication");
            System.out.println("Output matrix would be "+mt1.length+" X "+mt2[0].length);
            int[][] out=  computeMultiplication(mt1,mt2);
            printMatrix(out);

    }

    public static int[][] computeMultiplication(int[][] m1, int[][]m2){
        int[][] result = new int[m1.length][m2[0].length];

        for (int i = 0; i < m1.length ; i++) {
            for (int j = 0; j < m2[0].length ; j++) {
                int sum=0;
                for (int k = 0; k < m1[0].length ; k++) {
                    sum+=m1[i][k]*m2[k][j];
                }
                result[i][j] = sum;
            }
        }
        return  result;
    }

    public static void printMatrix(int[][] print) {

        for (int i = 0; i < print.length; i++) {
            for (int j = 0; j < print[0].length; j++) {
                System.out.print(print[i][j]+" ");
            }
            System.out.println();
        }
    }
}
