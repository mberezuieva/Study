package com.course.onseo.automoto;

public class Bus extends Auto implements IMoveable {
    int engineCapacity;
    int fuelCapacity;

    Bus(String model, int sits, int goods, int engineCapacity, int fuelCapacity) {
        super(model, sits, goods);
        this.engineCapacity = engineCapacity;
        this.fuelCapacity = fuelCapacity;
    }
    public void Move () {
        System.out.println("I'm "+model+" sits = "+ sits+" goods = "+goods+" engineCapacity = "+engineCapacity+" fuelCapacity = "+fuelCapacity);
        System.out.println("I'll ride "+fuelCapacity/engineCapacity+" km");

    }
}
