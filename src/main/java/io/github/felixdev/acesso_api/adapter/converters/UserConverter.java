package io.github.felixdev.acesso_api.adapter.converters;


import io.github.felixdev.acesso_api.adapter.dtos.requests.UserRequest;
import io.github.felixdev.acesso_api.adapter.entities.UserEntity;
import io.github.felixdev.acesso_api.core.domain.User;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {


    public User toDomain(UserRequest userRequest) {
        return new User(
                userRequest.getId(),
                userRequest.getEmail(),
                userRequest.getPassword(),
                userRequest.getAdmin());
    }

    public UserRequest toUserRequest(User user) {
       return new UserRequest(
               user.getId(),
               null,
               user.getEmail(),
               user.getPassword(),
               user.getAdmin()
       );
    }

}
