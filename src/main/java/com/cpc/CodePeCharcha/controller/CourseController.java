package com.cpc.CodePeCharcha.controller;

import com.cpc.CodePeCharcha.service.CourseService;
import com.cpc.CodePeCharcha.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class CourseController {

    @Autowired
    CourseService courseService;

    @GetMapping("/Courses")
    public Collection<Course> getAllCourse() {
        return courseService.getAllCourse();

    }

    @GetMapping("/getCourse/{id}")
    public Course getCourseById(@PathVariable String id) {
        return courseService.getCourseById(id);
    }

    @PostMapping("/addCourse")
    public String addCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }

    @DeleteMapping("/deleteCourse/{id}")
    public String deleteCourseById(@PathVariable String id) {
        return courseService.deleteCourById(id);
    }
    @PostMapping("/updateCourse")
    public String updateCourseById(@RequestBody Course course){
        return courseService.updateCourseById(course);
    }


}