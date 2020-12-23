package com.course.onseo.laba2;

public class MyMass<T> {
    private T[] mass;


    public MyMass(T[] mass) {
        this.mass = mass;
    }

    public int getLength() {
        return mass.length;
    }

    public T getByIndex (int index) {
        return mass[index];
    }



}
