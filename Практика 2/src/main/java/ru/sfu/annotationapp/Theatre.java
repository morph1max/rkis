package ru.sfu.annotationapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Theatre {

    private Director director;

    public Theatre(Director director) {
        this.director = director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Director getDirector() {
        return this.director;
    }

    @PostConstruct
    private void initMethod() {
        System.out.println("Инит театра.");
    }

    @PreDestroy
    private void destroyMethod() {
        System.out.println("Конец театра.");
    }
}
