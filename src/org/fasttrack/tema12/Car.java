package org.fasttrack.tema12;

public class Car {
    private String name;
    private int age;
    private int km;
    private int price;

    public Car(String name, int age, int km, int price) {
        this.name = name;
        this.age = age;
        this.km = km;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getKm() {
        return km;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return name + ";" + km;
    }
}
