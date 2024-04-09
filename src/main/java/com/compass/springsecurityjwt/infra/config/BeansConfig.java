package com.compass.springsecurityjwt.infra.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.compass.springsecurityjwt.core.gateways.UserGateway;
import com.compass.springsecurityjwt.core.usecases.CreateUserUseCase;
import com.compass.springsecurityjwt.core.usecases.CreateUserUseCaseImpl;

@Configuration
public class BeansConfig {
    @Bean
    public CreateUserUseCase createUserUseCase(UserGateway userGateway) {
        return new CreateUserUseCaseImpl(userGateway);
    }

}
