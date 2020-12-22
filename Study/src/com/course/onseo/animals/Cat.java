package com.course.onseo.animals;


public class Cat extends Animal {


    public Cat(String name, String type, int age) {
        super(name, type, age);
    }

    @Override
    public void say() {
        System.out.println("may may");

    }

    @Override
    public void move() {
        System.out.println("cat move");

    }
}
