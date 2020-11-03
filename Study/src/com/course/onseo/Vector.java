package com.course.onseo;

public class Vector {
    private double x;
    private double y;
    private double z;

    Vector (double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        //System.out.println("Thank you for the input");
    }

    // finding vector length
    public double vectorLength () {
        return Math.sqrt (x*x + y*y + z*z);
    }

    // finding scalar produce of 2 vectors
    public double scalarProduct (Vector vector) {
        return (x*vector.x + y*vector.y + z*vector.z);
    }

    // finding vector produce of 2 vectors
    public Vector vectorProduct (Vector vector) {
        return new Vector
                ((y*vector.z - z*vector.y),
                (z*vector.x - x*vector.z),
                (x*vector.y - y*vector.x));
    }

    // finding corner between 2 vectors
    public double vectorCorner (Vector vector) {
        return scalarProduct(vector) / ( vectorLength() * vector.vectorLength() );
    }

    // finding vectors sum
    public Vector add (Vector vector) {
        return new Vector
                ((x + vector.x),
                (y + vector.y),
                (z + vector.z));
    }

    // finding vector difference
    public Vector subtract (Vector vector) {
        return new Vector((x - vector.x), (y - vector.y), (z - vector.z));
    }

    public static Vector [] Generator (int N) {
        Vector [] vectors = new Vector[N];
        for (int i = 0; i < N; i++) {
            vectors[i] = new Vector (Math.random(), Math.random(), Math.random());
        }
        return vectors;
    }


}
