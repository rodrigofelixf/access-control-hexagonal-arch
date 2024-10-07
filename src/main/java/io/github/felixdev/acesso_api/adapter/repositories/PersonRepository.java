package io.github.felixdev.acesso_api.adapter.repositories;

import io.github.felixdev.acesso_api.adapter.entities.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonEntity, Long> {
}
