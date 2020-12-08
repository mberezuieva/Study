package com.course.onseo;

public class Integer29 {
    public static void main(String[] args) {
        int a = 140;
        int b = 230;
        int c = 50;

        int d = (a/c) * (b/c);
        System.out.println((a/c) * (b/c) + " squares " + c + "x" + c + " can fit in rectangle with sides " + a + " and " + b);
        System.out.println((a%c)*b + (b%c)*a + " m2 of space is left");
    }

}
