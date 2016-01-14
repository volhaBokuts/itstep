package com.company;

public class MaxNum {

    public static void main(String[] args) {

        //Определить какое из 3 числел максимальное и вывести его.

        int a1 = 3;
        int a2 = 7;
        int a3 = 5;

        if (a1 > a2) {
            if (a1 > a3) {
                System.out.println("Первое число самое большое - " + a1);
            } else {
                System.out.println("Третье число самое большое - " + a3);
            }
        } else if (a2 > a3) {
            System.out.println("Второе число самое большое - " + a2);
        } else {
            System.out.println("Третье число самое большое - " + a3);
        }

    }
}
