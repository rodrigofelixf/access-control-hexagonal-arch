package io.github.felixdev.acesso_api.adapter.repositories;


import io.github.felixdev.acesso_api.adapter.entities.UserEntity;
import io.github.felixdev.acesso_api.core.domain.User;
import io.github.felixdev.acesso_api.core.ports.UserRepositoryPort;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserRepositoryAdapter implements UserRepositoryPort {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public UserRepositoryAdapter(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public User create(User user) {
        var newUser = userRepository.save(modelMapper.map(user, UserEntity.class));
        return modelMapper.map(newUser, User.class);
    }
}
