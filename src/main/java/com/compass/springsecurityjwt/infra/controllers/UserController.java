package com.compass.springsecurityjwt.infra.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compass.springsecurityjwt.core.entities.User;
import com.compass.springsecurityjwt.core.usecases.CreateUserUseCase;

@RestController()
@RequestMapping("users")
public class UserController {

    private final CreateUserUseCase createUserUseCase;

    public UserController(CreateUserUseCase createUserUseCase) {
        this.createUserUseCase = createUserUseCase;
    }

    @PostMapping()
    public User createUser() {
        var user = new User("cezarmezzalira",
                "12345",
                "cezar.mezzalira@gmail.com");

        return createUserUseCase.execute(user);
    }

    // @GetMapping()
    // public List<User> getUsers() {

    // }
}
