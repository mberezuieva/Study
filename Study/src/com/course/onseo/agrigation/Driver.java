package com.course.onseo.agrigation;

public class Driver {
    private String name;
    private Car car;
    private boolean isCarSettled;

    public Driver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private boolean isCarSettled() {
        return car == null;
    }


    public void setCar(Car car) {
        isCarSettled = true;
        car.setDriver(this);
        this.car = car;
    }
}
