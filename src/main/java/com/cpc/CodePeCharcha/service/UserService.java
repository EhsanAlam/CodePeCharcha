package com.cpc.CodePeCharcha.service;


import com.cpc.CodePeCharcha.model.User;
import com.cpc.CodePeCharcha.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.getAllUser();
    }

    public User getUserIdById(int id) {
        return userRepository.getUserByUserId(id);
    }

    public String addUser(User user) {
        return userRepository.addUser(user);
    }

    public String deleteUesrById(int id) {
        User user = userRepository.getUserByUserId(id);
        if (user != null) {
            return userRepository.deleteUserById(id);
        }
        return "id is not exists";
    }

    public String updateUser(User users) {
        int id = users.getUserid();
        User u= userRepository.getUserByUserId(id);
        if(u==null){
            return "this user is not exists";
        }
        return userRepository.updateUser(users);
    }
}