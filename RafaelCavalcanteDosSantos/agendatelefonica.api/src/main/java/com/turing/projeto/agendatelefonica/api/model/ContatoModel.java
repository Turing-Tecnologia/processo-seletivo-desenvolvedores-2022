package com.turing.projeto.agendatelefonica.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "contato")
public class ContatoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nome", nullable = false, length = 50)
    private String nome;
    @Column(name = "numero", nullable = false, length = 15)
    private String numero;
    @Column(name = "email", nullable = false, length = 100)
    private String email;
}
