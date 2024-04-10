package com.compass.springsecurityjwt.infra.mappers;

import org.springframework.stereotype.Component;

import com.compass.springsecurityjwt.core.entities.User;
import com.compass.springsecurityjwt.infra.controllers.dto.CreateUserDto;

@Component
public class CreateUserDtoMapper {
    public User toUser(CreateUserDto dto) {
        return new User(dto.username(), dto.password(), dto.email());
    }

    public CreateUserDto toto(User user) {
        return new CreateUserDto(user.username(), user.password(), user.email());
    }
}
