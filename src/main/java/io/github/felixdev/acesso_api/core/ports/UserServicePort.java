package io.github.felixdev.acesso_api.core.ports;

import io.github.felixdev.acesso_api.core.domain.User;

public interface UserServicePort {

    User createUser(User user);
}
