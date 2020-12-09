package com.course.onseo.agrigation;

public class Engine {
    private String serialNumber;
    private double volume;
    private String type;

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getVolume() {
        return volume;
    }

    public String getType() {
        return type;
    }

    public Engine(String serialNumber, double volume, String type) {
        this.serialNumber = serialNumber;
        this.volume = volume;
        this.type = type;
    }
}
