package com.cpc.CodePeCharcha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class LoginController {

    @Autowired
    LoginInterface l;

    @GetMapping("/login/{username}/{password}")
    public boolean login(@PathVariable String username,@PathVariable String password){
        return l.login(username, password);
    }



    @GetMapping("/list")
    public Collection<User> list(){
        return l.getRegisteredUsers();
    }
}
