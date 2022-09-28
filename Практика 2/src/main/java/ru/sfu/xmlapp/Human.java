package ru.sfu.xmlapp;

public class Human implements Director {

    private String name;

    public Human(String name) {
        this.name = name;
    }

    public Human() {}

    public void setName(String name) {
        this.name = name;
    }

    public String getInfoDirector() {
        return "Director name = " + this.name;
    }
}
