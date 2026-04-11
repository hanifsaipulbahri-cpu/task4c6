package com.example.demoapi.model;

public class Course {
    // private fields for course properties
    private String title;
    private String category;
    private int durationHours;

    public Course() {
        // Default constructor
    }

    public Course(String title, String category, int durationHours) {
        this.title = title;
        this.category = category;
        this.durationHours = durationHours;
    }

    // getters and setters for course properties
    public String getCategory() {
    return category;
}

    public void setCategory(String category) {
    this.category = category;
}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDurationHours() {
        return durationHours;
    }

    public void setDurationHours(int durationHours) {
        this.durationHours = durationHours;
    }
}
