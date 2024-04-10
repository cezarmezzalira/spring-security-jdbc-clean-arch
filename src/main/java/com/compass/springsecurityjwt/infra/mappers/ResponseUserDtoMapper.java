package com.compass.springsecurityjwt.infra.mappers;

import org.springframework.stereotype.Component;

import com.compass.springsecurityjwt.core.entities.User;
import com.compass.springsecurityjwt.infra.controllers.dto.ResponseUserDto;

@Component
public class ResponseUserDtoMapper {
    public ResponseUserDto toDto(User user) {
        return new ResponseUserDto(user.userId(), user.username(), user.email());
    }

}
