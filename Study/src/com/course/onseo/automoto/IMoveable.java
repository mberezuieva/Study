package com.course.onseo.automoto;

public interface IMoveable {
    default void Move ()
    {
        System.out.println("Default move");
    }
}
