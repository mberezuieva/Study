package com.course.onseo.automoto;

public abstract class Auto {
    protected String model;
    protected int sits;
    protected int goods;

    Auto (String model, int sits, int goods) {
        this.model = model;
        this.sits = sits;
        this.goods = goods;
    }

}
