package com.compass.springsecurityjwt.infra.controllers.dto;

public record ResponseUserDto(
        String userId,
        String username,
        String email) {

}
