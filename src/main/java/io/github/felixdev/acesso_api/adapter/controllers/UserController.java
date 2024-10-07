package io.github.felixdev.acesso_api.adapter.controllers;


import io.github.felixdev.acesso_api.adapter.converters.UserConverter;
import io.github.felixdev.acesso_api.adapter.dtos.requests.UserRequest;
import io.github.felixdev.acesso_api.core.domain.User;
import io.github.felixdev.acesso_api.core.ports.UserServicePort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/users")
public class UserController {

    private final UserServicePort userServicePort;
    private final UserConverter userConverter;

    public UserController(UserServicePort userServicePort, UserConverter userConverter) {
        this.userServicePort = userServicePort;
        this.userConverter = userConverter;
    }


    @PostMapping
    public ResponseEntity<UserRequest> create(@RequestBody UserRequest userRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
                userConverter.toUserRequest(userServicePort.createUser(userConverter.toDomain(userRequest)))
        );

    }
}
