package com.compass.springsecurityjwt.infra.persistence.repositories;

import org.springframework.data.repository.ListCrudRepository;

import com.compass.springsecurityjwt.infra.persistence.jdbc.entities.RoleEntity;

public interface RoleRepository extends ListCrudRepository<RoleEntity, Long>{
    
}
