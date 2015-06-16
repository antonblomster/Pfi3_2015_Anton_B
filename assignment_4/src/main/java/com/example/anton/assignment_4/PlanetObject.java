package com.example.anton.assignment_4;

import java.io.Serializable;

/**
 * Created by Anton on 15-04-23.
 */

public class PlanetObject implements Serializable {

    private String name;
    private int image;
    private String description;
    private String radius;
    private String avragetemp;


    public PlanetObject(String name, int image, String description, String radius, String avragetemp) {
        this.name = name;
        this.image = image;
        this.description = description;
        this.radius = radius;
        this.avragetemp = avragetemp;
    }


    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getRadius() {
        return radius;
    }

    public void setRadius(String radius) {
        this.radius = radius;
    }

    public String getAvragetemp() {
        return avragetemp;
    }

    public void setAvragetemp(String avragetemp) {
        this.avragetemp = avragetemp;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
