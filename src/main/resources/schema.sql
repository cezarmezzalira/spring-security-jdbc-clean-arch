DROP TABLE IF EXISTS roles;
DROP TABLE IF EXISTS users;

CREATE TABLE roles (
    role_id BIGSERIAL PRIMARY KEY,
    role_name VARCHAR(255),
    role_description TEXT,
    created_at TIMESTAMP,
    updated_at TIMESTAMP,
    version BIGINT
);

CREATE TABLE users (
    user_id UUID PRIMARY KEY,
    username VARCHAR(255),
    password VARCHAR(255),
    email VARCHAR(255),
    enabled BOOLEAN,
    created_at TIMESTAMP,
    updated_at TIMESTAMP,
    version BIGINT
);
