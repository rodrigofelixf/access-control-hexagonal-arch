package io.github.felixdev.acesso_api.adapter.repositories;

import io.github.felixdev.acesso_api.adapter.entities.ResidentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResidentRepository extends JpaRepository<ResidentEntity, Long> {

    ResidentEntity findByDocument(String document);
}
