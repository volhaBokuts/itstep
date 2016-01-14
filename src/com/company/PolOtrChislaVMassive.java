package com.company;

import java.util.Random;

public class PolOtrChislaVMassive {

    public static void main(String[] args) {

        //Посчитать процентное соотношение положительных и отрицательных чисел в массиве

        int[] m1 = new int[10]; //объявляем массив


        Random random = new Random();
        for (int i = 0; i < m1.length; i++) {
            m1[i] = -500 + random.nextInt(1000); //заполняем массив рандомными числами от -500 до 500, инициализируем его
        }


        for(int i = 0; i < m1.length; i++) {
            System.out.println(i + ":" + m1[i]); //выводим массив
        }

        int sumOfPositive = 0;
        int sumOfNegative = 0;

        for (int i = 0; i < m1.length; i++) {
            if (m1[i] >= 0) {
                sumOfPositive = sumOfPositive + 1;
            }
            else {
                sumOfNegative = sumOfNegative + 1;
            }
        }

        System.out.println(sumOfPositive);
        System.out.println(sumOfNegative);

        int percentOfPositive = sumOfPositive*100/m1.length;
        int percentOfNegative = sumOfNegative*100/m1.length;

        System.out.println("Процентное соотношение положительных чисел в массиве = " + percentOfPositive + "%");
        System.out.println("Процентное соотношение отрицательных чисел в массиве = " + percentOfNegative + "%");

    }

}
