package com.cpc.CodePeCharcha.repository;

import com.cpc.CodePeCharcha.model.Course;
import com.cpc.CodePeCharcha.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class MappingRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<String> getListOfId(int id) {
        String query = "Select courseId from  instCourseMapping where instructarId="+id;
        return jdbcTemplate.queryForList(query,String.class);

    }

    public List<Integer> getlistOfInstId(String id) {
        String query = "Select instructarId from  instCourseMapping where courseId='"+id+"'";
        return jdbcTemplate.queryForList(query,Integer.class);
    }
}
