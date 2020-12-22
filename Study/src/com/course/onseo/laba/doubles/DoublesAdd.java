package com.course.onseo.laba.doubles;

public class DoublesAdd implements IDoubles{
    Double a;
    Double b;

    public Double Count (Double a, Double b) {
        System.out.println("Add Doubles a: "+a+" and b: "+b+" :");
        return a+b;
    }
}
