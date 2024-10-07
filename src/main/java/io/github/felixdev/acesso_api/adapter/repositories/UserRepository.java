package io.github.felixdev.acesso_api.adapter.repositories;

import io.github.felixdev.acesso_api.adapter.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
