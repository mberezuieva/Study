package com.course.onseo.automoto;

public class App {
    public static void main(String[] args) {
        Bus bus = new Bus("Ikarus", 42, 500,20,200);
        Truck truck = new Truck("Belaz", 2, 1500,50,500);
        Bicycle bike = new Bicycle("Ukraina", 1, 20);

        IMoveable[] moveables = {bus, truck, bike};
        for (int i = 0; i < moveables.length; i++) moveables[i].Move();

        Auto bus1 = new Bus("LAZ", 42, 500,20,200);
        IMoveable bus2 = (IMoveable) bus1;
        bus2.Move();
        Bus bus3 = (Bus)bus1;
        bus3.Move();
    }
}
