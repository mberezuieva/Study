package com.course.onseo.agrigation;

import java.util.Arrays;

public class Car {
    private String model;

    private Driver driver;
    private Wheel[]wheel;

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
        if(driver.getCar() == this)
            return;
        this.driver = driver;
        driver.setCar(this);
    }

    public Wheel[] getWheel() {
        return wheel;
    }

    public void setWheel(Wheel[] wheel) {
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", wheel=" + Arrays.toString(wheel) +
                ", engine=" + engine +
                '}';
    }
}
