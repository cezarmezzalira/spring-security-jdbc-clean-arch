package com.compass.springsecurityjwt.core.gateways;

import java.util.List;

import com.compass.springsecurityjwt.core.entities.User;

public interface UserGateway {
    User createUser(User user);

    List<User> getUsers();
}
