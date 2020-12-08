package com.course.onseo;

public class Human {
    int age;
    String name;
    boolean male;

    Human (String name, int age, boolean male) {
        this.name = name;
        this.age = age;
        this.male = male;
    }

    public Boolean beerLover () {
        if (male) return true;
        return false;
    }
}
