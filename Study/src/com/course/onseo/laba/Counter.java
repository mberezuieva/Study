package com.course.onseo.laba;

import com.course.onseo.laba.doubles.*;
import com.course.onseo.laba.integers.*;
import com.course.onseo.laba.longs.*;
import com.course.onseo.laba.strings.*;

public class Counter {
    private IIntegers[] integers;
    private ILongs[] longs;
    private IDoubles[] doubles;
    private IStrings[] strings;

    Counter () {
        integers = new IIntegers[] {new IntegersAdd(), new IntegersSubtract(), new IntegersMultiply(), new IntegersDivide()};
        longs = new ILongs[] {new LongsAdd(), new LongsSubtract(), new LongsMultiply(), new LongsDivide()};
        doubles = new IDoubles[] {new DoublesAdd(), new DoublesSubtract(), new DoublesMultiply(), new DoublesDivide()};
        strings = new IStrings[] {new StringsAdd()};

    }

    public Integer Count (Integer a, Integer b, int c) {
        return integers[c].Count(a, b);
    }

    public Long Count (Long a, Long b, int c) {
        return longs[c].Count(a, b);
    }

    public Double Count (Double a, Double b, int c) {
        return doubles[c].Count(a, b);
    }

    public String Count (String a, String b, int c) {
        return strings[c].Count(a, b);
    }
}
