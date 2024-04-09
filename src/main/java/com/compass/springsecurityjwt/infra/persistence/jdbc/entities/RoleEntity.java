package com.compass.springsecurityjwt.infra.persistence.jdbc.entities;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("roles")
public record RoleEntity(
        @Id @Column("role_id") Long roleId,
        @Column("role_name") String roleName,
        @Column("role_description") String roleDescription,
        @Column("created_at") LocalDateTime createdAt,
        @Column("updated_at") LocalDateTime updatedAt,
        Long version) {

    public RoleEntity(
            String roleName,
            String roleDescription) {
        this(null, roleName, roleDescription, LocalDateTime.now(), null, null);
    }

    public RoleEntity withRoleId(Long roleId) {
        return new RoleEntity(roleId, roleName, roleDescription, createdAt, updatedAt, version);
    }
}
