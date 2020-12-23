package com.course.onseo.generic;

import com.course.onseo.animals.Animal;


public class Container<T extends Animal> {
    private T obj;


    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
