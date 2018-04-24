package com.example.a16033774.problemstatementp02;

public class Holidays {
    private String description;
    private String date;
    private int image;
    private String category;

    public Holidays(int image, String description, String date,String category) {
        this.image = image;
        this.description = description;
        this.date = date;
        this.category = category;
    }

    public int image() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }
    public String getCategory() {
        return category;
    }
}
