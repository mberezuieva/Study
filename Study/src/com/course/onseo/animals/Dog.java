package com.course.onseo.animals;

public class Dog extends Animal{
    public Dog(String name, String type, int age) {
        super(name, type, age);
    }

    @Override
    public void move() {
        System.out.println("dog move");

    }

    @Override
    public void say() {
        System.out.println("gav gav");

    }
}
