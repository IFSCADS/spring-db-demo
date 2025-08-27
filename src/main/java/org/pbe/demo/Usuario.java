package org.pbe.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;

@Entity
// anotação @Data do Lombok poupa de escrever getters, setters,
// construtor ...
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String sobrenome;

    // Getters and Setters
    // mas não precisa, porque o Lombok já gerou !
}
