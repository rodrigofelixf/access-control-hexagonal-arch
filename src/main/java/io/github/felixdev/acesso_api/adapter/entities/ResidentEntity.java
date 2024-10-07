package io.github.felixdev.acesso_api.adapter.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_resident")
public class ResidentEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String document;
    private String address;
    private String phoneNumber;
    @OneToOne
    @JoinColumn(name = "person_id")
    private PersonEntity personEntity;
}
