package com.course.onseo.animals;

public abstract class Animal implements ISay, IMove {
    private String name;
    private String type;
    private int age;

    public Animal (String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }


}
