package io.github.felixdev.acesso_api.adapter.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_person")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PersonEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
}
