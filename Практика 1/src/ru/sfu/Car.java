package ru.sfu;

import java.util.Objects;

public class Car extends Transport {
    private String brand;
    private int cost;

    public Car() {
        super();
        this.brand = null;
        this.cost = 0;
    }

    public Car(String color, int weight, String brand, int cost) {
        super(color, weight);
        this.brand = brand;
        this.cost = cost;
    }

    public String getBrand() {
        return this.brand;
    }

    public int getCost() {
        return this.cost;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (this.getClass() != otherObject.getClass()) return false;

        if (!super.equals(otherObject)) return false;

        Car car = (Car) otherObject;
        return this.brand.equals(car.brand) && this.cost == car.cost;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getColor(), this.getWeight(), this.brand, this.cost);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color=" + this.getColor() + ";" +
                "weight=" + this.getWeight() + ";" +
                "brand=" + this.brand + ";" +
                "cost=" + this.cost + ";}";
    }
}
