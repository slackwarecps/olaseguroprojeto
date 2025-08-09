package br.com.fabioalvaro.bananaserver.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@RestController
public class OlaMundoController {

    @GetMapping("/olamundo")
    public String olaMundo() {
        return "<h1>Ola mamãe!</h1> A data e hora de agora é: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }

}