package com.cpc.CodePeCharcha.repository;


import com.cpc.CodePeCharcha.model.Student;
import com.cpc.CodePeCharcha.model.StudentComment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class StudentRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public  List<String> allComment(String studentId) {
        String query = "select commentStudnt from commentStudent where studentId ='"+studentId+"'";
         return jdbcTemplate.queryForList(query,String.class);

    }

    public String addStudent(Student student) {
        String query = "Insert into Student values(" + getStudentParam(student) + ")";
        jdbcTemplate.update(query);
        return "Successfully added";
    }

    private String getStudentParam(Student student) {
        return "'" + student.getStudentId() + "','" + student.getStudentName() + "','" + student.getDateOfBirth() + "'," + student.getMobileNo() + ",'" + student.getEmailId() + "','" + student.getAddress()+"'";
    }

    public List<Student> getAllStudent() {
        return jdbcTemplate.query("select * from Student", BeanPropertyRowMapper.newInstance(Student.class));
    }

    public Student getStudentById(String id) {
        Student student;
        String query="select * from Student where studentId='"+id+"'";
        try{
           student= jdbcTemplate.queryForObject(query, BeanPropertyRowMapper.newInstance(Student.class));
        }catch (Exception exception){
            student=null;
        }
        return student;
    }

    public String deleteStudent(String id) {
        String query= "delete from Student where studentId='" + id+"'";
        jdbcTemplate.update(query);
        return "delete Successfully";
    }

    public String updateStudent(Student student) {
        String query="update from Student where studentId='"+student.getStudentId()+"'";
        jdbcTemplate.update(query);
        return "update successfully";

    }
    public String addStudentComment(StudentComment studentComment){
        String query="Insert into CommentStudent values('"+studentComment.getStudentId()+"',"+"'"+studentComment.getStudentComment()+"')";

        jdbcTemplate.update(query);
        return "we got your feedback our team will connect you soon";
    }
    public String getEmail(String studentId){
        String query="select emailId from Student where studentId='"+studentId+"'";
       String email= jdbcTemplate.queryForObject(query, String.class);
        return email;
    }
}
