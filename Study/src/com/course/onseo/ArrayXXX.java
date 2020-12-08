package com.course.onseo;

public class ArrayXXX {
    public static void main(String[] args) {
        int [] mass1 = new int[10];
        int [] mass2 = new int[10];
        int [] mass3 = new int[20];




        for (int i = 0; i < mass1.length; i++) {
            mass1[i] = (int)(Math.random()*10);
            mass2[i] = (int)(Math.random()*10 + 10);
        }

        for (int i = 0; i < mass1.length; i++) {
            System.out.print(mass1[i]+ " ");;
        }
        System.out.println();
        for (int i = 0; i < mass1.length; i++) {
            System.out.print(mass2[i]+ " ");;

        }
        System.out.println();
        for (int i = 0; i < mass3.length; i++) {
            if (i<10) mass3[i] = mass1[i];
            else mass3[i] = mass2[i-10];
        }
        System.out.println();
        for (int i = 0; i < mass3.length; i++) {
            System.out.print(mass3[i]+ " ");;

        }


    }
}
