package com.compass.springsecurityjwt.core.usecases;

import com.compass.springsecurityjwt.core.entities.User;
import com.compass.springsecurityjwt.core.gateways.UserGateway;

public class CreateUserUseCaseImpl implements CreateUserUseCase {

    private final UserGateway userGateway;

    public CreateUserUseCaseImpl(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    @Override
    public User execute(User user) {
        return userGateway.createUser(user);
    }

}
