package com.cpc.CodePeCharcha.controller;

import com.cpc.CodePeCharcha.service.LoginInterface;
import com.cpc.CodePeCharcha.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

    @Autowired
    LoginInterface l;

    @PostMapping("/register")
    public String register(@RequestBody User u){
        return l.register(u);
    }
}
