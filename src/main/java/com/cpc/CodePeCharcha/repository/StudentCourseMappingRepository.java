package com.cpc.CodePeCharcha.repository;

import com.cpc.CodePeCharcha.model.StudentCourseMapping;
import com.cpc.CodePeCharcha.model.UpdateCourse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class StudentCourseMappingRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public String addStudentAndCourse(StudentCourseMapping studentCourseMapping){
        String query="insert into studentCourseMap values('"+studentCourseMapping.getStudentId()+"','"+studentCourseMapping.getCourseId()+"')";
        jdbcTemplate.update(query);
        return "successFully added";
    }

    public List<String> getCourseByStudentId(String studentId){
        String query ="select courseID from studentCourseMap where studentId ='"+studentId+"'";

           return jdbcTemplate.queryForList(query,String.class);

    }
    public String updateCourseByStudentId(UpdateCourse updateCourse){
        String query ="update studentCourseMap set courseId='"+updateCourse.getCourseId1()+"' where studentId='"+updateCourse.getStudentId()+"' and courseId='"+updateCourse.getCourseId()+"' ";
        jdbcTemplate.update(query);
        return "successfully update";
    }
    public String deleteCourseByStudentId(String studentId,String courseId){
        String query="delete from studentCourseMap where studentId ='"+studentId+"' and courseId='"+courseId+"'";
        jdbcTemplate.update(query);
        return "successfully deleted";
    }
}
