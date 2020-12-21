package com.course.onseo.laba;

public class Counter {
    private IIntegers[] integers;

    Counter () {
        integers = new IIntegers[]{new IntegersAdd(), new IntegersSubtract(), new IntegersMultiply(), new IntegersDivide()};

    }
    public Integer Count (Integer a, Integer b, int c) {
        return integers[c].Count(a, b);
    }
}
