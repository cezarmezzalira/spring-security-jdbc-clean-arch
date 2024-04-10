package com.compass.springsecurityjwt.infra.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compass.springsecurityjwt.core.usecases.CreateUserUseCase;
import com.compass.springsecurityjwt.infra.controllers.dto.CreateUserDto;
import com.compass.springsecurityjwt.infra.controllers.dto.ResponseUserDto;
import com.compass.springsecurityjwt.infra.mappers.CreateUserDtoMapper;
import com.compass.springsecurityjwt.infra.mappers.ResponseUserDtoMapper;

import lombok.AllArgsConstructor;

@RestController()
@RequestMapping("users")
@AllArgsConstructor
public class UserController {

    private final CreateUserUseCase createUserUseCase;
    private final CreateUserDtoMapper createUserDtoMapper;
    private final ResponseUserDtoMapper responseUserDtoMapper;

    @PostMapping()
    public ResponseEntity<ResponseUserDto> createUser(@RequestBody CreateUserDto dto) {
        var user = this.createUserDtoMapper.toUser(dto);
        var createdUser = createUserUseCase.execute(user);
        var userDto = responseUserDtoMapper.toDto(createdUser);
        return ResponseEntity.ok(userDto);
    }
}
