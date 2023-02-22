package com.cpc.CodePeCharcha.service;

import com.cpc.CodePeCharcha.model.Course;
import com.cpc.CodePeCharcha.model.Instructor;
import com.cpc.CodePeCharcha.model.User;
import com.cpc.CodePeCharcha.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
@Service
public class CourseService {

    @Autowired
     private CourseRepository courseRepository;


    Collection<Course> al=new ArrayList<>();
    CourseService(){
        Course c=new Course("101","java","6momths","50000","abc");
        Course c1=new Course("102","springboot","6momths","50000","abc");
        Course c2=new Course("103","datastructure","6momths","50000","abc");
        al.add(c);
        al.add(c1);
        al.add(c2);
    }
    public Collection<Course> getAllCourse(){

        return courseRepository.getAllCourse();
    }

    public Course getCourseById(String id){
        return courseRepository.getCourse(id);
    }

    public String addCourse(Course course) {
        return courseRepository.addCourse(course);
    }

    public String deleteCourById(String id){
        Course course =courseRepository.getCourse(id);
        if (course == null){
            return "Id is not present";
        }
        return courseRepository.deleteCourseById(id);
    }

    public String updateCourseById(Course course) {
        String id = course.getCourseId();
        Course c= courseRepository.getCourse(id);
        if(c==null){
            return "this course id is not exists";
        }
        return courseRepository.updateCourse(course);
    }
}
