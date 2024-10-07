package io.github.felixdev.acesso_api.infra;


import io.github.felixdev.acesso_api.core.ports.UserRepositoryPort;
import io.github.felixdev.acesso_api.core.ports.UserServicePort;
import io.github.felixdev.acesso_api.core.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {


    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public UserServicePort userServicePort(UserRepositoryPort userRepositoryPort){
        return new UserService(userRepositoryPort);
    }
}
