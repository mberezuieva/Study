package com.course.onseo;

public class ArrayTest {
    public static void main(String[] args) {
        int [] mass = new int[20];
        int sum = 0;
        int pr = 1;

        for (int i = 0; i < mass.length-2; i++) {
            mass[i] = (int)(Math.random()*10);
        }

        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i]+ " ");
        }
        System.out.println();

        for (int i = 0; i < mass.length-2; i++) {
            if (mass[i]%2==0) sum+=mass[i];
            else pr*=mass[i];
        }
        mass[mass.length-2] = sum;
        mass[mass.length-1] = pr;

        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i]+ " ");
        }
        /*System.out.println("Sum = "+ sum);

        for (int i: mass) {
            sum+=i;
        }
*/
    }
}
