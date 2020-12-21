package com.course.onseo.notebook.myArray;

public class MyArray {
    private int[] mass;

    public MyArray(int[] mass) {
        this.mass = mass;
    }
    public MyArray(int length) {
        this.mass = new int[length];
    }

    public int getLength() {
        return mass.length;
    }

    public void randomize() {
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int)(Math.random()*100);
        }
    }

    public int getElement(int index) throws Exception {
        if (index >= mass.length)
            throw new ArrayIndexOutOfBoundsException("wrong index : "+index);
        if (index <0)
            throw new NullPointerException("index < 0 ");
        return mass[index];

    }

    public int getIndexOfElement(int maxValue) throws Exception {
        for (int i = 0; i < mass.length; i++) {
            if (mass[i]==maxValue)
                return i;
        }
        throw new Exception("element not found");
    }
}
