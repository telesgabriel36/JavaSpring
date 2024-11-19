package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {

    // Primeira rota
    @GetMapping("/rota1")
    public String rota1() {
        return "Rota 1!";
    }

    // Segunda rota com um parâmetro opcional
    @GetMapping("/rota2")
    public String rota2(@RequestParam(value = "nome", defaultValue = "Visitante") String nome) {
        return "Olá, " + nome + "! Bem-vindo: Rota 2!";
    }


}
