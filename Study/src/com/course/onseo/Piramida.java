package com.course.onseo;

public class Piramida {
    public static void main(String[] args) {

        int n = 1;
        int k = 7;
        while (n <= k) {
           for (int i = (k-n)/2; i > 0; i--) {
               System.out.print(" ");
           }
           for (int j = 0; j < n; j++) {
               System.out.print("*");
           }
           for (int i = (k-n)/2; i > 0; i--) {
               System.out.print(" ");
           }
           System.out.println();
           n+=2;
       }

    }
}
