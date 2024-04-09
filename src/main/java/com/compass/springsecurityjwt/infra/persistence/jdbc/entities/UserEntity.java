package com.compass.springsecurityjwt.infra.persistence.jdbc.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table("users")
public class UserEntity {

    @Id
    @Column("user_id")
    UUID userId;
    String username;
    String password;
    String email;
    boolean enabled;
    @Column("created_at")
    LocalDateTime createdAt;
    @Column("updated_at")
    LocalDateTime updatedAt;
    @Version
    Long version;

    public UserEntity(
            UUID userId,
            String username,
            String password,
            String email) {
        var isBlankId = (userId == null || userId.toString().isBlank());
        this.userId = isBlankId ? UUID.randomUUID() : userId;
        this.username = username;
        this.password = password;
        this.email = email;
        this.enabled = false;
        this.createdAt = LocalDateTime.now();
    }
}
