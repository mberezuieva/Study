package com.course.onseo;

public class Cylinder extends Circle {
    private int height;

    Cylinder (int x, int y, int rad, int height) {
        super (x, y, rad);
        this.height = height;
    }

    public int getHeight() { return height; }

    public void setHeight(int height) { this.height = height; }

    public double surfaceCyl () {
        return height*lengthCircle() + 2*circleArea();
    }
    public double volumeCyl () {
        return height*circleArea();
    }

    public String toString() {
        return "Point "+getX()+" "+getY()+" "+getHeight();
    }



}
