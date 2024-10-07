package io.github.felixdev.acesso_api.core.services;

import io.github.felixdev.acesso_api.core.domain.User;
import io.github.felixdev.acesso_api.core.ports.UserRepositoryPort;
import io.github.felixdev.acesso_api.core.ports.UserServicePort;


public class UserService implements UserServicePort {


    private final UserRepositoryPort userRepositoryPort;

    public UserService(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }


    @Override
    public User createUser(User user) {
        return userRepositoryPort.create(user);
    }
}
