package io.github.felixdev.acesso_api.adapter.repositories;


import io.github.felixdev.acesso_api.adapter.entities.PersonEntity;
import io.github.felixdev.acesso_api.adapter.entities.ResidentEntity;
import io.github.felixdev.acesso_api.adapter.entities.UserEntity;
import io.github.felixdev.acesso_api.core.domain.Resident;
import io.github.felixdev.acesso_api.core.domain.User;
import io.github.felixdev.acesso_api.core.ports.ResidentRepositoryPort;
import io.github.felixdev.acesso_api.core.ports.UserRepositoryPort;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ResidentRepositoryAdapter implements ResidentRepositoryPort {

    private final ResidentRepository residentRepository;
    private final PersonRepository personRepository;
    private final ModelMapper modelMapper;

    public ResidentRepositoryAdapter(ResidentRepository residentRepository, PersonRepository personRepository, ModelMapper modelMapper) {
        this.residentRepository = residentRepository;
        this.personRepository = personRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public Resident create(Resident resident) {
        PersonEntity personEntityMap = modelMapper.map(resident.getPerson(), PersonEntity.class);
        PersonEntity newPerson = personRepository.save(personEntityMap);
        ResidentEntity residentEntity = modelMapper.map(resident, ResidentEntity.class);
        residentEntity.setPersonEntity(newPerson);

        ResidentEntity newResident = residentRepository.save(residentEntity);
        return modelMapper.map(newResident, Resident.class);
    }

    @Override
    public Resident findByDocument(String document) {
        ResidentEntity userByDocument = residentRepository.findByDocument(document);
        if (userByDocument == null) {
            return null;
        }
        return modelMapper.map(userByDocument, Resident.class);
    }
}
