package ru.sfu.xmlapp;

public class GroupManagers implements Director {

    private int amountManagers;

    public GroupManagers(int amountManagers) {
        this.amountManagers = amountManagers;
    }

    public String getInfoDirector() {
        return "Amount managers = " + this.amountManagers;
    }
}
