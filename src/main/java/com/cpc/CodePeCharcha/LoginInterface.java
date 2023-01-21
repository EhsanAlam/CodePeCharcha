package com.cpc.CodePeCharcha;

import java.util.Collection;

public interface LoginInterface {

    boolean login(String username, String password);

    String register(User user);

    Collection<User> getRegisteredUsers();
}
