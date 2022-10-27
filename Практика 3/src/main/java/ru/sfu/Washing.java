package ru.sfu;


public class Washing {
    private int id;
    private int weight;
    private int clothingCapacity;

    private String manufacturingCompany;
    private String model;
    private String ProducingCountry;

    public Washing(int id, int weight, int clothingCapacity, String manufacturingCompany, String model, String producingCountry) {
        this.id = id;
        this.weight = weight;
        this.clothingCapacity = clothingCapacity;
        this.manufacturingCompany = manufacturingCompany;
        this.model = model;
        ProducingCountry = producingCountry;
    }

    public Washing() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getClothingCapacity() {
        return clothingCapacity;
    }

    public void setClothingCapacity(int clothingCapacity) {
        this.clothingCapacity = clothingCapacity;
    }

    public String getManufacturingCompany() {
        return manufacturingCompany;
    }

    public void setManufacturingCompany(String manufacturingCompany) {
        this.manufacturingCompany = manufacturingCompany;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProducingCountry() {
        return ProducingCountry;
    }

    public void setProducingCountry(String producingCountry) {
        ProducingCountry = producingCountry;
    }

    @Override
    public String toString() {
        return "WashingMachine{" +
                "id=" + id +
                ", weight=" + weight +
                ", clothingCapacity=" + clothingCapacity +
                ", manufacturingCompany='" + manufacturingCompany + '\'' +
                ", model='" + model + '\'' +
                ", ProducingCountry='" + ProducingCountry + '\'' +
                '}';
    }
}
