package com.cpc.CodePeCharcha.repository;

import com.cpc.CodePeCharcha.model.Instructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class InstructorRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public Instructor getInstructorById(int id){
        String query = "Select * from Instructor where id = " + id;

        Instructor i;
        try{
            i  = jdbcTemplate.queryForObject(query, BeanPropertyRowMapper.newInstance(Instructor.class));
        }catch (Exception exception){
            i= null;
        }

        return i;

    }


    public List<Instructor> getAllInstructor() {
        String query = "Select * from Instructor";
        return jdbcTemplate.query(query,BeanPropertyRowMapper.newInstance(Instructor.class));

    }

    public String addInstructor(Instructor instructor) {
        String query ="Insert into Instructor values(" + getInstructorParam(instructor) + ")";
        jdbcTemplate.update(query);
        return "added successfully";
    }


    private String getInstructorParam(Instructor instructor){
        return   instructor.getId() + ",'" + instructor.getName() + "','" +  instructor.getMobile() + "','" + instructor.getAddress() + "','" + instructor.getEmail()+"',"+ instructor.getAdhaarNo();
    }

    public String deleteInstructorById(int id) {
        String query = "delete from Instructor where id =" + id;
        jdbcTemplate.update(query);
        return "Successfully deleted";
    }
    public String updateInstructorById(Instructor instructor){
        String query= "Update Instructor set name='" + instructor.getName() + "',mobile='" + instructor.getMobile()+ "',Address='" + instructor.getAddress() + "',email='" + instructor.getEmail() + "',adhaarNo='" + instructor.getAdhaarNo()
                + "' where Id=" + instructor.getId();
        jdbcTemplate.update(query);
        return "successfully updated";
    }
}
