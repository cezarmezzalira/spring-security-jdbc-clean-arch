package com.compass.springsecurityjwt;

import java.util.Set;
import java.util.UUID;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.compass.springsecurityjwt.infra.persistence.jdbc.entities.RoleEntity;
import com.compass.springsecurityjwt.infra.persistence.jdbc.entities.UserEntity;
import com.compass.springsecurityjwt.infra.persistence.repositories.RoleRepository;
import com.compass.springsecurityjwt.infra.persistence.repositories.UserRepository;

@SpringBootApplication
public class SpringSecurityJwtApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityJwtApplication.class, args);
    }

    @Bean
    ApplicationRunner applicationRunner(RoleRepository roleRepository, UserRepository userRepository) {
        return args -> {
            var roles = Set.of(new RoleEntity("ADMIN", "Administrator"),
                    new RoleEntity("USER", "User"));
            roleRepository.saveAll(roles);
            roleRepository.findAll().forEach(System.out::println);

            var users = Set.of(new UserEntity(null,
                    "Cezar",
                    "12345",
                    "cezar.mezzalira@gmail.com"));
            userRepository.saveAll(users);
            userRepository.findAll().forEach(System.out::println);
        };
    }

}
