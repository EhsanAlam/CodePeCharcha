package com.cpc.CodePeCharcha.service;

import com.cpc.CodePeCharcha.model.Course;
import com.cpc.CodePeCharcha.model.StudentCourseMapping;
import com.cpc.CodePeCharcha.model.UpdateCourse;
import com.cpc.CodePeCharcha.repository.CourseRepository;
import com.cpc.CodePeCharcha.repository.StudentCourseMappingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentCourseMappingService {
    @Autowired
    StudentCourseMappingRepository studentCourseMappingRepository;
    @Autowired
    CourseRepository courseRepository;
    public String addStudentAndCourse(StudentCourseMapping studentCourseMapping){
        return studentCourseMappingRepository.addStudentAndCourse(studentCourseMapping);
    }

    public List<Course> getCourseByStudentId(String studentId){
        List<String> courseId = studentCourseMappingRepository.getCourseByStudentId(studentId);
        List<Course> course = new ArrayList<>();
        for (String s : courseId) {
            course.add(courseRepository.getCourse(s));
        }
        return course;
    }

    public String updateCourseByStudentId(UpdateCourse updateCourse){
        return studentCourseMappingRepository.updateCourseByStudentId(updateCourse);
    }
    public String deleteCourseByStudentId(String studentId,String courseId){
        return studentCourseMappingRepository.deleteCourseByStudentId(studentId,courseId);
    }


}
