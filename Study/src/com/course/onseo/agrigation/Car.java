package com.course.onseo.agrigation;

public class Car {
    private String model;
    private Driver driver;
    private Wheel[] wheel;
    private Engine engine;


    public Car(String model, Wheel[] wheel, String engineSerialNumber, double engineVolume, String engineType) {
        this.model = model;
        this.wheel = wheel;
        this.engine = new Engine(engineSerialNumber, engineVolume, engineType);
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Wheel[] getWheel() {
        return wheel;
    }

    public void setWheel(Wheel[] wheel) {
        this.wheel = wheel;
    }


}
