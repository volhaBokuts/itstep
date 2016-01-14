package com.company;


public class DaysInYear {

    public static void main(String[] args) {

        //Определить количество дней в году.

        int godOtscheta = 2016;
        int god = 2021;

        if ((god - godOtscheta) % 4 == 0) {
            System.out.println("В " + god + " году 366 дней");
        } else {
            System.out.println("В " + god + " году 365 дней");
        }

    }

}
