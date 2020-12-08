package com.course.onseo.animals;

public class Human implements ISay, IMove, IWork{


    @Override
    public void move() {
        System.out.println("human move");

    }

    @Override
    public void say() {
        System.out.println("human say");

    }

    @Override
    public void work() {
        System.out.println("human work");

    }
}
