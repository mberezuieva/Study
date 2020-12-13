package com.course.onseo.figures;

public class Circle extends Point {
    private int rad;

    Circle (int x, int y, int rad) {
        super (x, y);
        this.rad = rad;
    }

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }

    public double circleArea () {
      return rad*rad*Math.PI;

    }

    public double lengthCircle () {
        return 2*rad*Math.PI;
    }

    public String toString() {
        return "Circle "+getX()+" "+getY()+" "+rad;
    }
}