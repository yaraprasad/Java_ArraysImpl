package com.java.version.eight.custom.functional.interfaces;

public class  CalculateResult{

    public static void main(String[] args) {


        //Lambda expression implementation
        CalculateInterface add = (a,b) -> a+b;

        CalculateInterface subtract = (a,b) -> a-b;

        CalculateInterface multiply = (a,b) -> a*b;

        CalculateInterface division = (a,b) -> {
            if(b==0){
                throw new ArithmeticException("Division by zero");
            }
            return a/b;
        };

        CalculateInterface reminder = (a,b) -> {
            if(b==0){
                throw new ArithmeticException("Division by zero");
            }
            return a%b;
        };

        CalculateInterface hcf = (a,b) -> {
            while(b != 0){
                int temp = b;
                b=a%b;
                a=temp;
            }
            return a;
        };

        CalculateInterface lcm = (a,b) -> {
            int x=a,y=b;
            while(b != 0){
                int temp = b;
                b=a%b;
                a=temp;
            }
            return x*y/a;
        };

        System.out.println(add.calculate(10,5));
        System.out.println(subtract.calculate(10,5));
        System.out.println(multiply.calculate(10,5));
        System.out.println(division.calculate(10,5));
        System.out.println(reminder.calculate(36,60));
        System.out.println(hcf.calculate(10,3));
        System.out.println(lcm.calculate(36,60));
        System.out.println(lcm.calculate(5,7));
        System.out.println(lcm.calculate(15,18));
        System.out.println(hcf.calculate(15,18));
    }
}
