package com.company;

public class CifriVChisle {

    public static void main(String[] args) {

        //Сказать сколько цифр в числе и его знак

        int n = -6545397;
        int countOfNum = 0;

        for (int i = n; i != 0; i = i/10){
            countOfNum = countOfNum + 1;
        }

        if (n <=0) {
            System.out.println("Число " + n + " имеет знак минус и состоит из " + countOfNum + " цифр");
        } else {
            System.out.println("Число " + n + " имеет знак плюс и состоит из " + countOfNum + " цифр");
        }

    }
}
