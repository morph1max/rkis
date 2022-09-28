package ru.sfu.xmlapp;


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

}
