package com.cpc.CodePeCharcha.repository;

import com.cpc.CodePeCharcha.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class UserRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<User> getAllUser() {

        return jdbcTemplate.query("select * from Users", BeanPropertyRowMapper.newInstance(User.class));
    }

    public User getUserByUserId(int id) {
        User u;
        try {
            u = jdbcTemplate.queryForObject("select * from Users where userId=" + id, BeanPropertyRowMapper.newInstance(User.class));

        } catch (Exception exception) {
            u = null;
        }
        return u;

    }

    public String addUser(User user) {
        String query = "Insert into Users values(" + getUserParam(user) + ")";
        jdbcTemplate.update(query);
        return "Successfully added";
    }

    private String getUserParam(User user) {
        return "'" + user.getUsername() + "','" + user.getPassword() + "','" + user.getEmail() + "','" + user.getMobile() + "','" + user.getAddress() + "'," + user.getUserid();
    }

    public String deleteUserById(int id) {
        String query = "delete from Users where userid=" + id;
        jdbcTemplate.update(query);
        return "successfully deleted";

    }

    public String updateUser(User users) {
        String query = "Update Users set userName='" + users.getUsername() + "',password='" + users.getPassword() + "',email='" + users.getEmail() + "',mobile='" + users.getMobile() + "',address='" + users.getAddress()
                + "' where userId=" + users.getUserid();
        jdbcTemplate.update(query);
        return "successfully updated";
    }
}

