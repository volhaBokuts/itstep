package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // Создать массив и сделать его копию

        int[] m1 = new int[10]; //объявляем массив

        //int[] m1 = {1, 2, 3}; другой способ объявления массива

        /*int[] m1 = new int[1000];
        for (int i = 0; i < m1.length; i++) {  //заполнение массива одинаковыми значениями
            m1[i] = 5;
        }

        for (int i = 0; i < m1.length; i++) {  //заполнение массива последовательными числами от единицы
            m1[i] = i + 1;
        }*/

       //Заполнение массива рандомными числами

        Random random = new Random();
        for (int i = 0; i < m1.length; i++) {
            m1[i] = -500 + random.nextInt(1000); // числа от -500 до 500
        }

        for(int i = 0; i < m1.length; i++) {
            System.out.println(i + ":" + m1[i]);  // вывод массива
        }


        //Копирование массива

        int[] m2 = new int[7];

        for(int i = 0; i < m2.length; i++) {
            m2[i] = m1[i];
        }

        for(int i = 0; i < m2.length; i++) {
            System.out.println(m2[i]);
        }

    }
}
