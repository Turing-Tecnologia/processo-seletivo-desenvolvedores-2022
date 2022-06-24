package com.turing.projeto.agendatelefonica.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping(path = "/api/status")
public class StatusController {

    @GetMapping(path = "/verificarconexao")
    public String verificarConexao(){
        return "API em execução";
    }
}
