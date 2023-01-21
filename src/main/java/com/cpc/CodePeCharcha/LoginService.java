package com.cpc.CodePeCharcha;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;

@Service
public class LoginService implements LoginInterface{
    HashMap<String,User> h=new HashMap<>();

    LoginService(){
        User u=new User("ehsan","khagaria","ehsanalam2309@gmail.com","9709285866","khagaria");
        h.put(u.username,u);
    }

    public boolean login(String username,String password){
        return h.containsKey(username) && h.get(username).password.equals(password);
    }

    public String register(User userdetail){
        if (! h.containsKey(userdetail.username)){
            h.put(userdetail.username,userdetail);
             return "registered successfully";
        }else{
            return "already registered";
        }
    }

    public Collection<User> getRegisteredUsers(){
       return h.values();
    }
}
