package io.github.felixdev.acesso_api.core.services;

import io.github.felixdev.acesso_api.core.domain.Resident;
import io.github.felixdev.acesso_api.core.domain.User;
import io.github.felixdev.acesso_api.core.ports.ResidentRepositoryPort;
import io.github.felixdev.acesso_api.core.ports.ResidentServicePort;
import io.github.felixdev.acesso_api.core.ports.UserRepositoryPort;
import io.github.felixdev.acesso_api.core.ports.UserServicePort;


public class ResidentService implements ResidentServicePort {


    private final ResidentRepositoryPort residentRepositoryPort;

    public ResidentService(ResidentRepositoryPort residentRepositoryPort) {
        this.residentRepositoryPort = residentRepositoryPort;
    }


    @Override
    public Resident createResident(Resident resident) {
        var existResident = residentRepositoryPort.findByDocument(resident.getDocument());
        if (existResident != null ) {
            throw new RuntimeException("Exist User");
        }
        return residentRepositoryPort.create(resident);
    }
}


