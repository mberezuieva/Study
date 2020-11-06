package com.course.onseo;
import com.course.onseo.Begin;

public class BeginTest {
    public static void main(String[] args) {
        //#1
        //System.out.println("task #1: p = " + Begin.squarePerimeter(4));

        //#2
        //System.out.println("task #2: s = " + Begin.squarePerimeter(3));

        //#3
        //System.out.println("task #3: s = " + Begin.rectanglePerimeter(4, 3));

        int N = 0;

        if (N > 0) {
            if (N % 2 ==0)
                System.out.println("even pos");
            else System.out.println("odd pos");
        }
        else if (N < 0) {
            if (N % 2 ==0)
                System.out.println("even neg");
            else System.out.println("odd neg");

        }
        else System.out.println("zero");


        int month = 1;
        switch(month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default: System.out.println("Wrong");;
        }




        //#1
        int a =4;
        int b = 3;
        int c = 5;

        a = a+b+c;
        b = a - (b + c);
        //c =


        //a->b b->c c->a


        //#11







    }


}
