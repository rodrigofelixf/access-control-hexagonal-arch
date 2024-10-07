package io.github.felixdev.acesso_api.adapter.dtos.requests;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ResidentRequest {
    private Long id;
    private String name;
    private String document;
    private String address;
    private String phoneNumber;


}











