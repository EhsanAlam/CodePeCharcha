package com.cpc.CodePeCharcha;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
@Service
public class CourseService {
    Collection<Course> al=new ArrayList<>();
    CourseService(){
        Course c=new Course("101","java","6momths","50000","abc");
        Course c1=new Course("102","springboot","6momths","50000","abc");
        Course c2=new Course("103","datastructure","6momths","50000","abc");
        al.add(c);
        al.add(c1);
        al.add(c2);
    }
    Collection<Course> getAllCourse(){
        return al;
    }
}
