package com.cpc.CodePeCharcha.controller;

import com.cpc.CodePeCharcha.model.Course;
import com.cpc.CodePeCharcha.model.CourseInstDetails;
import com.cpc.CodePeCharcha.model.InstCourseDetails;
import com.cpc.CodePeCharcha.model.Instructor;
import com.cpc.CodePeCharcha.service.MappingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class instCourseMappingController {
    @Autowired
    MappingService mappingService;

    @GetMapping("/getListOfCourse/{id}")
  public List<Course> getListOfCourse(@PathVariable int id){
      return mappingService.getListOfCourse(id);

  }
    @GetMapping("/getInstCourseDetails/{id}")
    public InstCourseDetails getInstCourseDetails(@PathVariable int id){
        return mappingService.getInstCourseDetails(id);
    }
    @GetMapping("/getCourseInstDetails/{id}")
    public CourseInstDetails getCourseInstDetails(@PathVariable String id){
        return mappingService.getCourseInstDetails(id);
    }
    @GetMapping("/getDetailsOfAllInstWithCourse")
    public List<InstCourseDetails> getDetailsOfAllInstWithCourse(){
        return mappingService.getDetailsOfAllInstWithCourse();
    }
    @GetMapping("/getDetailsOfAllCourseWithInst")
    public List<CourseInstDetails> getDetailsOfAllCourseWithInst(){
        return mappingService.getDetailsOfAllCourseWithInst();
    }


}
