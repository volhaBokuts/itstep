package com.company;

import java.util.Random;

public class MaxSumOfElements {

    public static void main(String[] args) {

        /*В массиве сравить попарно (1 со 2, 2 с 3, 3 с 4 и тд) элементы
        и найти те 2, сумма которых максимальная.*/

        int[] arr = new int[6];
        Random proizvol = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = proizvol.nextInt(20);
            System.out.println(arr[i]);
        }

        int sumOfElements = arr[0] + arr[1];
        int pervijElement = 0;
        int vtorojElement = 0;

        for (int i = 1; i < arr.length - 1; i++) {
            if ((arr[i] + arr[i + 1]) > sumOfElements) {
                sumOfElements = (arr[i] + arr[i+1]);
                pervijElement = i;
                vtorojElement = i + 1;
            } else if ((arr[i] + arr[i + 1]) < sumOfElements) {
                sumOfElements = (arr[0] + arr[1]);
                pervijElement = 0;
                vtorojElement = 1;
            }
        }

        // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 6 - выходит за пределы массива

        System.out.println("Максимальная сумма - " + sumOfElements + " - сумма " + pervijElement + "-го и " + vtorojElement + "-го элемента");

    }

}
