package com.example.deleteitem;

public class Model {
    String name;
    String place;
    String position;

    public Model(String name, String place, String position) {
        this.name = name;
        this.place = place;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
