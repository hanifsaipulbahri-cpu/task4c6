package com.example.demoapi.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

// DTO = Data Transfer Object
public class CreateCourseRequest {

    @NotBlank(message = "Title is required")
    private String title;

    @NotBlank(message = "Category is required")
    private String category;

    @Min(value = 1, message = "Duration must be at least 1 hour")
    private int durationHours;

    public CreateCourseRequest() {
    }

    // GETTERS
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public int getDurationHours() {
        return durationHours;
    }

    // SETTERS
    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDurationHours(int durationHours) {
        this.durationHours = durationHours;
    }
}