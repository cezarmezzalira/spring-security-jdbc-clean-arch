package com.compass.springsecurityjwt.infra.mappers;

import java.util.UUID;

import org.springframework.stereotype.Component;

import com.compass.springsecurityjwt.core.entities.User;
import com.compass.springsecurityjwt.infra.persistence.jdbc.entities.UserEntity;

@Component
public class UserEntityMapper {
    public UserEntity toEntity(User user) {
        var userId = user.userId() == null ? null : UUID.fromString(user.userId());
        return new UserEntity(
                userId,
                user.username(),
                user.password(),
                user.email());
    }

    public User toDomain(UserEntity entity) {
        return new User(
                entity.getUserId().toString(),
                entity.getUsername(),
                entity.getPassword(),
                entity.getEmail(),
                entity.isEnabled(),
                entity.getCreatedAt().toString(),
                entity.getUpdatedAt() != null ? entity.getUpdatedAt().toString() : null);
    }
}
