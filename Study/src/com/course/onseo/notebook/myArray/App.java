package com.course.onseo.notebook.myArray;

import static com.course.onseo.notebook.myArray.Helper.divide;

public class App {
    public static void main(String[] args) {
        Boolean c = null;
        MyArray array = new MyArray(8);
        array.randomize();

 /*       for (int i = -1; i <= array.getLength(); i++) {
            try {
                System.out.print(array.getElement(i)+" ");
            }
            catch (ArrayIndexOutOfBoundsException ex) {
                ex.printStackTrace();
                break;

            }
            catch (Exception e) {
                e.printStackTrace();
            }
            finally {
                System.out.println("Bugagashen'ka");
            }
        }
        */

        int p = divide(10);

        System.out.println("p = " +p);
    }
}
