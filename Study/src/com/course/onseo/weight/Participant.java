package com.course.onseo.weight;

public class Participant implements Comparable {
    private String name;
    private int weight;

    Participant (String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Object o) {
        Participant p = (Participant)o;
        if(weight < p.getWeight()) return -1;
        if(weight == p.getWeight()) return 0;
        return 1;
    }
}
