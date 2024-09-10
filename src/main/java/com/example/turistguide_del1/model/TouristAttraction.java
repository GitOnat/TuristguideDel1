package com.example.turistguide_del1.model;

public class TouristAttraction {

    private String name;
    private String description;

    public TouristAttraction() {
    }

    public TouristAttraction(String name, String description) {
        this.description = description;
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}