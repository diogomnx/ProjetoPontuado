package com.github.jhugosc.ProjetoPontuado.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.jhugosc.ProjetoPontuado.model.UsuarioModel;

@Controller
@RequestMapping("/projeto")
public class UsuarioController {
    
    @GetMapping("/getAll")
    public List<UsuarioModel> getAllUsuarioModel(){
        return List.of(
        new UsuarioModel(1, "Carlos", "carlos@email.com", "(71)12340567"),
        new UsuarioModel(2, "João", "joao@email.com", "(71)23567897"),
        new UsuarioModel(3, "Pedro", "pedro@email.com", "(71)23574567"),
        new UsuarioModel(4, "Lucas", "lucas@email.com", "(71)84345674"));
    }

}
