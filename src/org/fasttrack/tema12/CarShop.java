package org.fasttrack.tema12;

import java.util.*;

public class CarShop {
    private List<Car> cars;

    public CarShop(List<Car> cars) {
        this.cars = cars;
    }

    public Map<Range, List<Car>> getCarsByRange(List<Range> ranges) {
        Map<Range, List<Car>> carsByRange = new HashMap<>();

        for(Car car: cars) {
            Range myRange = null;
            for (Range currentRange: ranges) {
                if (currentRange.isValueInRange(car.getKm())) {
                    myRange = currentRange;
                    break;
                }
            }
            List<Car> currCarsByRange = carsByRange.get(myRange);
            if (currCarsByRange == null) {
                List<Car> myCars = new ArrayList<>();
                myCars.add(car);
                carsByRange.put(myRange, myCars);
            } else {
                currCarsByRange.add(car);
                carsByRange.put(myRange, currCarsByRange);
            }
        }
        return carsByRange;
    }

    public Map<String, Integer> carsByName() {
        Map<String, Integer> carsByName = new HashMap<>();
        Set<String> uniqueCars = getUniqueCarNames();
        for (String currentCarName: uniqueCars) {
            carsByName.put(currentCarName, getNrOfCarsByName(currentCarName));
        }
        return carsByName;
    }

    private Integer getNrOfCarsByName(String name) {
        int count = 0;
        for (Car car: cars) {
            if (car.getName().equals(name)) {
                count++;
                //nrKm = nrKm + car.getKm();
            }
        }
        return count;
    }

    public Set<String> getUniqueCarNames() {
        Set<String> uniqueCars = new HashSet<>();

        for(Car car: cars) {
            uniqueCars.add(car.getName());
        }

        return uniqueCars;
    }

    public Car getFirstCarWithName(String name) {
        Car car = null;

        for (Car currentCar: cars) {
            if (name.equals(currentCar.getName())) {
                car = currentCar;
                break;
            }
        }
        return car;
    }


}
