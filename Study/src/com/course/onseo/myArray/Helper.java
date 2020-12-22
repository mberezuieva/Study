package com.course.onseo.myArray;

public class Helper {

    public static int getInt(MyArray array) throws Exception {
        return array.getIndexOfElement((int) (Math.random() * 100));
    }

    public static int divide(int x) {
        int count = 0;
        for (int i = -10; i <= 10; i++) {
            try {
                if (x % i == 0)

                    count++;
            } catch (ArithmeticException e) {
            }

        }
        return count;

    }


    public static void bla_bla (int number) {
        switch (number) {
            case 1:

        }
    }
}