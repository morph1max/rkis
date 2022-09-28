package ru.sfu;

import java.util.Objects;

public class Transport {

    private String color;
    private int weight;

    public Transport() {
        this.weight = 0;
        this.color = null;
    }

    public Transport(String brand, int weight) {
        this.color = brand;
        this.weight = weight;
    }

    public String getColor() {
        return this.color;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (this.getClass() != otherObject.getClass()) return false;

        Transport transport = (Transport) otherObject;
        return this.weight == transport.weight && this.color.equals(transport.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.color, this.weight);
    }

    @Override
    public String toString() {
        return "Transport{color=" + this.color + ";weight=" + this.weight + ";}";
    }
}
