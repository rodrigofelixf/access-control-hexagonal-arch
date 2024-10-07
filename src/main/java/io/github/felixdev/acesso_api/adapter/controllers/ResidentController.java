package io.github.felixdev.acesso_api.adapter.controllers;

import io.github.felixdev.acesso_api.adapter.converters.ResidentConverter;
import io.github.felixdev.acesso_api.adapter.dtos.requests.ResidentRequest;
import io.github.felixdev.acesso_api.core.ports.ResidentServicePort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/residents")
public class ResidentController {

    private final ResidentServicePort residentServicePort;
    private final ResidentConverter residentConverter;

    public ResidentController(ResidentServicePort residentServicePort, ResidentConverter residentConverter) {
        this.residentServicePort = residentServicePort;
        this.residentConverter = residentConverter;
    }

    @PostMapping
    public ResponseEntity<ResidentRequest> create(@RequestBody ResidentRequest residentRequest) {
        return ResponseEntity.status(HttpStatus.CREATED).body(
                residentConverter.toResidentRequest(residentServicePort.createResident(residentConverter.toDomain(residentRequest)))
        );

    }
}

