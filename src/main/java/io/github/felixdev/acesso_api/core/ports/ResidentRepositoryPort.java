package io.github.felixdev.acesso_api.core.ports;

import io.github.felixdev.acesso_api.core.domain.Resident;
import io.github.felixdev.acesso_api.core.domain.User;

public interface ResidentRepositoryPort {

    Resident create(Resident resident);
    Resident findByDocument(String document);
}
