package org.fasttrack.tema12;

import java.util.ArrayList;
import java.util.List;

public class MainCars {

    public static void main(String[] args) {
        Car bmw = new Car("bmw", 1, 100, 10000);
        Car audi = new Car("audi", 2, 200, 1000);
        Car dacia = new Car("dacia", 10, 10000, 100);
        List<Car> myCars = new ArrayList<>();

        myCars.add(bmw);
        myCars.add(bmw);
        myCars.add(bmw);
        myCars.add(audi);
        myCars.add(audi);
        myCars.add(audi);
        myCars.add(dacia);
        myCars.add(dacia);

        CarShop carShop = new CarShop(myCars);

        System.out.println(carShop.getUniqueCarNames());
        System.out.println(carShop.carsByName());
        Range r1 = new Range(0, 150);
        Range r2 = new Range(151, 1000);
        Range r3 = new Range(1001, 1000000);

        List<Range> ranges = new ArrayList<>();
        ranges.add(r1);
        ranges.add(r2);
        ranges.add(r3);

        System.out.println(carShop.getCarsByRange(ranges));

    }
}
