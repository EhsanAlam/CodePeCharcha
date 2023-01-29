package com.cpc.CodePeCharcha.service;

import com.cpc.CodePeCharcha.model.User;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;

@Service
public class LoginService implements LoginInterface {
    HashMap<String, User> h=new HashMap<>();

    LoginService(){
        User u=new User("ehsan","khagaria","ehsanalam2309@gmail.com","9709285866","khagaria", 1);
        h.put(u.getUsername(),u);
    }

    public boolean login(String username,String password){
        return h.containsKey(username) && h.get(username).getPassword().equals(password);
    }

    public String register(User userdetail){
        if (! h.containsKey(userdetail.getUsername())){
            h.put(userdetail.getUsername(),userdetail);
             return "registered successfully";
        }else{
            return "already registered";
        }
    }

    public Collection<User> getRegisteredUsers(){
       return h.values();
    }
}
