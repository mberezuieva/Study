package com.course.onseo;
import com.course.onseo.Begin;
import com.course.onseo.agrigation.Car;
import com.course.onseo.agrigation.Driver;
import com.course.onseo.agrigation.Wheel;

public class BeginTest {
    public static void main(String[] args) {

        Wheel[] wheels = new Wheel[4];
        for (int i =0; i < wheels.length; i++) {
            wheels[i] = new Wheel(17, "YYY");
        }
        Car car = new Car("citroen", wheels, "sdfsdf", 2.0, "dfdg");

        Driver driver = new Driver("sfsdf");
        car.setDriver(driver);

    }


}
