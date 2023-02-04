package com.heng.test;

public class Duck extends Bird {

    private String color;

    public Duck(String color) {
        this.color = color;
    }

    public Duck(int id, String name, String color) {
        super(id, name);
        this.color = color;
    }
}
