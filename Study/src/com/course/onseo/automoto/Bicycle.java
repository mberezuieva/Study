package com.course.onseo.automoto;

public class Bicycle extends Auto implements IMoveable{
    Bicycle(String model, int sits, int goods) {
        super(model, sits, goods);
    }

    public void Move () {
        System.out.println("I'm "+model+" sits = "+ sits+" goods = "+goods);

    }
}
