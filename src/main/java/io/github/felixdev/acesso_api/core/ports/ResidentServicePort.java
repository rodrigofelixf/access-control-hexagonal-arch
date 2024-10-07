package io.github.felixdev.acesso_api.core.ports;

import io.github.felixdev.acesso_api.core.domain.Resident;

public interface ResidentServicePort {

    Resident createResident(Resident resident);

}
