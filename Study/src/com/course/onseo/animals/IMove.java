package com.course.onseo.animals;

public interface IMove {
    default void move() {
        System.out.println("some move IMove");
    }
}
