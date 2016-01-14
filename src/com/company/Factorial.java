package com.company;

public class Factorial {

    public static void main(String[] args) {

        //Посчитать факториал числа

        int a = 7;
        int factorial = 1;
        for (int i = 1; i <= a; i++) {
            factorial = factorial * i;
        }

        System.out.println("Факториал числа " + a + " равен " + factorial);

    }

}
