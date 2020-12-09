package com.course.onseo;

import com.course.onseo.agrigation.Car;
import com.course.onseo.agrigation.Driver;
import com.course.onseo.agrigation.Wheel;
//import com.course.onseo.animal.*;
//import com.course.onseo.helpers.Helper;

public class BeginTest {
    public static void main(String[] args) {

        Wheel[] wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel(17,"Yota");
        }
        Car car = new Car("Zazda",wheels,
                "sadkhwjk5345utekjg78", 2.0,"Gaz");

        Driver driver = new Driver("Vasya");
        car.setDriver(driver);
        System.out.println(car.getDriver().toString());
        Car car2 = new Car("Mazda",wheels,
                "sadkhwjk5345utekjg97", 2.0,"Dizel");

        car2.setDriver(driver);
        System.out.println(car2.getDriver().toString());
    }
}

