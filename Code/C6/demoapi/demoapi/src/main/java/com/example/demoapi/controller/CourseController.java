package com.example.demoapi.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.example.demoapi.model.Course;
import com.example.demoapi.service.CourseService;
import com.example.demoapi.dto.CreateCourseRequest;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/courses")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @PostMapping
    public Course createCourse(@Valid @RequestBody CreateCourseRequest request) {
    return courseService.createCourse(request);
    }
    
}