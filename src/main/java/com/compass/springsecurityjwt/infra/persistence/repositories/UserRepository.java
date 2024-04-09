package com.compass.springsecurityjwt.infra.persistence.repositories;

import java.util.UUID;

import org.springframework.data.repository.ListCrudRepository;

import com.compass.springsecurityjwt.infra.persistence.jdbc.entities.UserEntity;

public interface UserRepository extends ListCrudRepository<UserEntity, UUID> {

}
