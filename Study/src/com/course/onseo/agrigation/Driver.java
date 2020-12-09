package com.course.onseo.agrigation;

public class Driver {
    private String name;
    private Car car;
    private boolean isCarSettled;

    public Driver(String name) {
        this.name = name;
        isCarSettled = false;
    }

    public String getName() {
        return name;
    }

    public void setCar(Car car) {
        if(car.getDriver() != this) {
            dismissDriver();
        }else {
            isCarSettled = true;
            this.car = car;
            car.setDriver(this);
        }
    }

    public Car getCar() {
        return car;
    }

    private void dismissDriver(){
        this.getCar().setDriver(null);
        this.setCar(null);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", car=" + car +
                '}';
    }
}
