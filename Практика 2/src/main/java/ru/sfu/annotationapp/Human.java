package ru.sfu.annotationapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Human implements Director {

    @Value("${humanDirector.name}")
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
