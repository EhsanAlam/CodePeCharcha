package com.cpc.CodePeCharcha.service;

import com.cpc.CodePeCharcha.model.Course;
import com.cpc.CodePeCharcha.model.CourseInstDetails;
import com.cpc.CodePeCharcha.model.InstCourseDetails;
import com.cpc.CodePeCharcha.model.Instructor;
import com.cpc.CodePeCharcha.repository.CourseRepository;
import com.cpc.CodePeCharcha.repository.InstructorRepository;
import com.cpc.CodePeCharcha.repository.MappingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MappingService {
    @Autowired
    CourseRepository courseRepository;
    @Autowired
    MappingRepository mappingRepository;
    @Autowired
    InstructorRepository instructorRepository;

    public List<Course> getListOfCourse(int id) {
        List<Course> courseList = new ArrayList<>();
        List<String> l = mappingRepository.getListOfId(id);
        for (int i = 0; i < l.size(); i++) {
            Course course = courseRepository.getCourse(l.get(i));
            courseList.add(course);
        }
        return courseList;
    }

    public InstCourseDetails getInstCourseDetails(int id) {

        Instructor instructor = instructorRepository.getInstructorById(id);
        List<Course> courseList = getListOfCourse(id);
        InstCourseDetails instCourseDetails = new InstCourseDetails(instructor, courseList);
        return instCourseDetails;

    }

    public CourseInstDetails getCourseInstDetails(String id) {
        List<Integer> instList = mappingRepository.getlistOfInstId(id);
        Course course = courseRepository.getCourse(id);
        List<Instructor> instructorList = new ArrayList<>();
        for (int i = 0; i < instList.size(); i++) {
            Instructor instructor = instructorRepository.getInstructorById(instList.get(i));
            instructorList.add(instructor);
        }
        return new CourseInstDetails(course, instructorList);

    }

    public List<InstCourseDetails> getDetailsOfAllInstWithCourse() {
        List<InstCourseDetails> list = new ArrayList<>();

        List<Instructor> instructorList=instructorRepository.getAllInstructor();
        for (Instructor instructor:instructorList){
            InstCourseDetails courseDetails = getInstCourseDetails(instructor.getId());
            list.add(courseDetails);
        }
        return list;
    }
}
