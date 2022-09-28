package ru.sfu;

import java.util.Objects;

public class Express extends Train {
    private String name;
    private int amountFloor;

    public Express() {
        super();
        this.name = null;
        this.amountFloor = 0;
    }

    public Express(String color, int weight, String nameFactory, int amountWagons, String name, int amountFloor) {
        super(color, weight, nameFactory, amountWagons);
        this.name = name;
        this.amountFloor = amountFloor;
    }

    public String getName() {
        return this.name;
    }

    public int getAmountFloor() {
        return this.amountFloor;
    }

    public void setName(String name) { this.name = name; }

    public void setAmountFloor(int amountFloor) { this.amountFloor = amountFloor; }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (this.getClass() != otherObject.getClass()) return false;

        if (!super.equals(otherObject)) return false;

        Express express = (Express) otherObject;
        return this.name.equals(express.name) && this.amountFloor == express.amountFloor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getColor(), this.getWeight(), this.name, this.amountFloor);
    }

    @Override
    public String toString() {
        return "Express{" +
                "color=" + this.getColor() + ";" +
                "weight=" + this.getWeight() + ";" +
                "nameFactory=" + this.getNameFactory() + ";" +
                "amountWagons=" + this.getAmountWagons() + ";" +
                "name=" + this.name + ";" +
                "amountFloor=" + this.amountFloor + ";}";
    }
}
