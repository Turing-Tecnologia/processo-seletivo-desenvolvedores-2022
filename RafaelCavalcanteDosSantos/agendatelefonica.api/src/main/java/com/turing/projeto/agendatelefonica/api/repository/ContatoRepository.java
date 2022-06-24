package com.turing.projeto.agendatelefonica.api.repository;

import com.turing.projeto.agendatelefonica.api.model.ContatoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<ContatoModel, Integer> {

}
