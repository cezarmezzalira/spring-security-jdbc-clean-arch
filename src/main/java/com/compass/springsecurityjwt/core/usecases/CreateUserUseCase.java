package com.compass.springsecurityjwt.core.usecases;

import com.compass.springsecurityjwt.core.entities.User;

public interface CreateUserUseCase {
    public User execute(User user);
}
