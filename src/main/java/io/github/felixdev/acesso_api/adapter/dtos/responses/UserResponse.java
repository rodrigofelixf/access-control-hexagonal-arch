package io.github.felixdev.acesso_api.adapter.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserResponse {
    private Long id;
    private String name;
    private String email;
    private String password;
    private Boolean isUserAdmin;
}
