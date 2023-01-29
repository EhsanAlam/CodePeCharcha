package com.cpc.CodePeCharcha.repository;

import com.cpc.CodePeCharcha.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public class CourseRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public Collection<Course> getAllCourse() {
        String query = "Select * from Course";

        return jdbcTemplate.query(query, BeanPropertyRowMapper.newInstance(Course.class));

    }

    public Course getCourse(String id) {
        String query = "Select * from Course where courseId=" + id;
        Course c;

        try {
            c = jdbcTemplate.queryForObject(query, BeanPropertyRowMapper.newInstance(Course.class));
        } catch (Exception exception) {
            c = null;
        }
        return c;
    }

    public String addCourse(Course course) {

        String query = "Insert into Course values(" + getCourseParam(course) + ")";
        jdbcTemplate.update(query);
        return "Successfully added";
    }

    private String getCourseParam(Course course) {
        return "'" + course.getCourseId() + "','" + course.getCourseName() + "','" + course.getDuration() + "','" + course.getFees() + "','" + course.getDescription() + "'";
    }

    public String deleteCourseById(String id) {
        String query = "delete from Course where courseId ='" + id + "'";
        jdbcTemplate.update(query);
        return "Successfully deleted";

    }

    public String updateCourse(Course course) {
        String query = "Update Course set courseName='" + course.getCourseName() + "',duration='" + course.getDuration() + "',fees='" + course.getFees() + "',description='" + course.getDescription() +""
                + "' where courseId=" + course.getCourseId();
        jdbcTemplate.update(query);
        return "successfully updated";
    }
}
