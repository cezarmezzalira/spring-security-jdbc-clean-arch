package com.compass.springsecurityjwt.core.entities;

public record User(
        String userId,
        String username,
        String password,
        String email,
        boolean enabled,
        String createdAt,
        String updatedAt) {
    public User(String username, String password, String email) {
        this(null, username, password, email, true, null, null);
    }
}
