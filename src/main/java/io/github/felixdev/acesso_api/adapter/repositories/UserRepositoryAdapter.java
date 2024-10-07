package io.github.felixdev.acesso_api.adapter.repositories;


import io.github.felixdev.acesso_api.adapter.entities.PersonEntity;
import io.github.felixdev.acesso_api.adapter.entities.UserEntity;
import io.github.felixdev.acesso_api.core.domain.User;
import io.github.felixdev.acesso_api.core.ports.UserRepositoryPort;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserRepositoryAdapter implements UserRepositoryPort {

    private final UserRepository userRepository;
    private final PersonRepository personRepository;
    private final ModelMapper modelMapper;

    public UserRepositoryAdapter(UserRepository userRepository, PersonRepository personRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.personRepository = personRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public User create(User user) {
        PersonEntity personEntityMap = modelMapper.map(user.getPerson(), PersonEntity.class);
        PersonEntity newPerson = personRepository.save(personEntityMap);
        UserEntity userEntity = modelMapper.map(user, UserEntity.class);
        userEntity.setPersonEntity(newPerson);

        UserEntity newUser = userRepository.save(userEntity);
        return modelMapper.map(newUser, User.class);
    }

    @Override
    public User findByEmail(String email) {
        UserEntity userByEmail = userRepository.findByEmail(email);
        if (userByEmail == null) {
            return null;
        }
        return modelMapper.map(userByEmail, User.class);
    }
}
