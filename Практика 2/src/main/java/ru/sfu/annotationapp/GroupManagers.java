package ru.sfu.annotationapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class GroupManagers implements Director {

    @Value("5")
    private int amountManagers;

    private GroupManagers() {}

    public static GroupManagers createGroupManager() {
        return new GroupManagers();
    }

    public GroupManagers(int amountManagers) {
        this.amountManagers = amountManagers;
    }

    public String getInfoDirector() {
        return "Amount managers = " + this.amountManagers;
    }
}
