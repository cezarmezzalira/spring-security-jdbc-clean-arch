package com.compass.springsecurityjwt.infra.gateway;

import java.util.List;

import org.springframework.stereotype.Component;

import com.compass.springsecurityjwt.core.entities.User;
import com.compass.springsecurityjwt.core.gateways.UserGateway;
import com.compass.springsecurityjwt.infra.mappers.UserEntityMapper;
import com.compass.springsecurityjwt.infra.persistence.repositories.UserRepository;

@Component
public class UserRepositoryGateway implements UserGateway {

    private final UserRepository userRepository;
    private final UserEntityMapper userEntityMapper;

    public UserRepositoryGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
        this.userRepository = userRepository;
        this.userEntityMapper = userEntityMapper;
    }

    @Override
    public User createUser(User user) {
        var userEntity = this.userEntityMapper.toEntity(user);
        var userCreated = this.userRepository.save(userEntity);
        return this.userEntityMapper.toDomain(userCreated);
    }

    @Override
    public List<User> getUsers() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUsers'");
    }

}
