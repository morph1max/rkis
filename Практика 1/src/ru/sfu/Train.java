package ru.sfu;

import java.util.Objects;

public class Train extends Transport {
    private String nameFactory;
    private int amountWagons;

    public Train() {
        super();
        this.nameFactory = null;
        this.amountWagons = 0;
    }

    public Train(String color, int weight, String nameFactory, int amountWagons) {
        super(color, weight);
        this.nameFactory = nameFactory;
        this.amountWagons = amountWagons;
    }

    public String getNameFactory() {
        return this.nameFactory;
    }

    public int getAmountWagons() {
        return this.amountWagons;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (this.getClass() != otherObject.getClass()) return false;

        if (!super.equals(otherObject)) return false;

        Train train = (Train) otherObject;
        return this.nameFactory.equals(train.nameFactory) && this.amountWagons == train.amountWagons;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getColor(), this.getWeight(), this.nameFactory, this.amountWagons);
    }

    @Override
    public String toString() {
        return "Train{" +
                "color=" + this.getColor() + ";" +
                "weight=" + this.getWeight() + ";" +
                "nameFactory=" + this.nameFactory + ";" +
                "amountWagons=" + this.amountWagons + ";}";
    }
}
