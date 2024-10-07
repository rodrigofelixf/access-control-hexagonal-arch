package io.github.felixdev.acesso_api.adapter.converters;


import io.github.felixdev.acesso_api.adapter.dtos.requests.ResidentRequest;
import io.github.felixdev.acesso_api.adapter.dtos.requests.UserRequest;
import io.github.felixdev.acesso_api.core.domain.Person;
import io.github.felixdev.acesso_api.core.domain.Resident;
import io.github.felixdev.acesso_api.core.domain.User;
import org.springframework.stereotype.Component;

@Component
public class ResidentConverter {


    public Resident toDomain(ResidentRequest residentRequest) {
        return new Resident(
                residentRequest.getId(),
                residentRequest.getDocument(),
                residentRequest.getAddress(),
                residentRequest.getPhoneNumber(),
                new Person(null, residentRequest.getName())


        );


    }

    public ResidentRequest toResidentRequest(Resident resident) {
       return new ResidentRequest(
               resident.getId(),
               resident.getPerson().getName(),
               resident.getDocument(),
               resident.getAddress(),
               resident.getPhoneNumber()
       );
    }

}
