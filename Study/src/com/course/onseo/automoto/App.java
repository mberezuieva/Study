package com.course.onseo.automoto;

public class App {
    public static void main(String[] args) {
        Auto bus = new Bus("Ikarus", 42, 500,20,200);
        Auto truck = new Truck("Belaz", 2, 1500,50,500);
        Auto bike = new Bicycle("Ukraina", 1, 20);
        Auto chair = new Chair("LazyBoy", 2, 10);

        IMoveable[] moveables = {bus, truck, bike, chair};
        for (int i = 0; i < moveables.length; i++) moveables[i].Move();


    }
}
