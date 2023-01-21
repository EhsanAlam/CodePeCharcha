package com.cpc.CodePeCharcha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;

@RestController
public class CourseController {

    @Autowired
    CourseService al;
    @GetMapping("/Courses")
    public Collection<Course> getAllCourse(){
        return al.getAllCourse();

    }
}
