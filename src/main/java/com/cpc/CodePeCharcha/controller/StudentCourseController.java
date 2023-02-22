package com.cpc.CodePeCharcha.controller;

import com.cpc.CodePeCharcha.model.Course;
import com.cpc.CodePeCharcha.model.StudentCourseMapping;
import com.cpc.CodePeCharcha.model.UpdateCourse;
import com.cpc.CodePeCharcha.service.StudentCourseMappingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentCourseController {
    @Autowired
    StudentCourseMappingService studentCourseMappingService;

    @PostMapping("/addStudentAndCourse")
    public String addStudentAndCourse(@RequestBody StudentCourseMapping studentCourseMapping){
        return studentCourseMappingService.addStudentAndCourse(studentCourseMapping);

    }
    @GetMapping("/getCourseByStudentId/{studentId}")
    public List<Course> getCourseByStudentId(@PathVariable String studentId){
        return studentCourseMappingService.getCourseByStudentId(studentId);
    }
    @PostMapping("/updateCourseIdByStudentId")
    public String updateCourseIdByStudentId(@RequestBody UpdateCourse updateCourse){
        return studentCourseMappingService.updateCourseByStudentId(updateCourse);
    }

    @DeleteMapping("/deleteCourseByStudentId/{studentId}/{courseId}")
    public String deleteCourseByStudentId( @PathVariable String studentId,@PathVariable String courseId ){
        return studentCourseMappingService.deleteCourseByStudentId(studentId,courseId);
    }

}
