package com.example.demoapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demoapi.model.Course;
import com.example.demoapi.dto.CreateCourseRequest;

@Service
public class CourseService {

    private final List<Course> courses = new ArrayList<>();

    public List<Course> getAllCourses() {
        return courses;
    }

    public Course createCourse(CreateCourseRequest request) {

        Course course = new Course(
            request.getTitle(),
            request.getCategory(),
            request.getDurationHours()
        );

        courses.add(course);
        return course;
    }
}