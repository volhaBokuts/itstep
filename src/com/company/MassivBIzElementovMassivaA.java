package com.company;

import java.util.Random;

public class MassivBIzElementovMassivaA {

    public static void main(String[] args) {

        // Сформировать массив Б элементами массива А, имеющими положительное значение и чётный индекс

        int[] m1 = new int[10]; //объявляем массив


        Random random = new Random();
        for (int i = 0; i < m1.length; i++) {
            m1[i] = -500 + random.nextInt(1000); //заполняем массив рандомными числами от -500 до 500, инициализируем его
        }


        for(int i = 0; i < m1.length; i++) {
            System.out.println(i + ":" + m1[i]); //выводим массив
        }

        int[] m2 = new int[10];


        int j = 0;
        for (int i = 0; i < m2.length; i++) {
            if(m1[i] > 0 && i % 2 == 0) {
                m2[j] = m1[i];
                j++;
            }
        }

        for (int i = 0; i < m2.length; i++) {
            System.out.println(i + ":" + m2[i]);
        }

    }

}
