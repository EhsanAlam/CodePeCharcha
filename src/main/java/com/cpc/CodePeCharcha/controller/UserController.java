package com.cpc.CodePeCharcha.controller;

import com.cpc.CodePeCharcha.model.User;
import com.cpc.CodePeCharcha.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/getAllUser")
    public List<User> getAllUser() {
        return userService.getAllUsers();
    }

    @GetMapping("userId/{id}")
    public User getUserByUserId(@PathVariable int id) {
        return userService.getUserIdById(id);
    }

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public String deleteUserbyId(@PathVariable int id) {
        return userService.deleteUesrById(id);
    }

    @PostMapping("/updateUser")
    public String updateUser(@RequestBody User users){
        return userService.updateUser(users);
    }

}
