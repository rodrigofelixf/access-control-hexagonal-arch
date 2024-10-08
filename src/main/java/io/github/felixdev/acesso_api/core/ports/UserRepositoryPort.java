package io.github.felixdev.acesso_api.core.ports;

import io.github.felixdev.acesso_api.core.domain.User;

public interface UserRepositoryPort {

    User create(User user);
    User findByEmail(String email);
}
