package com.turing.projeto.agendatelefonica.api.controller;

import com.turing.projeto.agendatelefonica.api.model.ContatoModel;
import com.turing.projeto.agendatelefonica.api.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/contatos")
public class ContatoController {

    @Autowired
    private ContatoRepository contatoRepository;

    //Método de listar todos os contatos existentes.
    @GetMapping(path = "/listar")
    public List<ContatoModel> listarContatos(){
        return contatoRepository.findAll();
    }

    //Método de adicionar um novo contato.
    @PostMapping(path = "/adicionar")
    public ContatoModel adicionarContato(@RequestBody ContatoModel contato){
        return contatoRepository.save(contato);
    }

    //Método de atualizar as informações do contato nome, número e email.
    @PutMapping(path = "/atualizar")
    public ResponseEntity<ContatoModel> atualizarContato(@RequestBody ContatoModel contato){
        return contatoRepository.findById(contato.getId())
                .map(record -> {
                    record.setNome(contato.getNome());
                    record.setNumero(contato.getNumero());
                    record.setEmail(contato.getEmail());
                    return ResponseEntity.ok().body(contatoRepository.save(record));
                }).orElse(ResponseEntity.notFound().build());
    }

    //Médoto de deletar contato utilizando seu identificador único (id).
    @DeleteMapping(path = "/deletar/{id}")
    public void deletarContato(@PathVariable("id") int id){
        contatoRepository.deleteById(id);
    }

    //Método de buscar por um contato utilizando seu (id).
    @GetMapping(path = "/buscar/{id}")
    public ResponseEntity buscarContato(@PathVariable("id") int id){
        return contatoRepository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    //Método de deletar todos os contatos.
    @DeleteMapping(path = "/deletarTodos")
    public void deletarTodosContatos(){
        contatoRepository.deleteAll();
    }
}
