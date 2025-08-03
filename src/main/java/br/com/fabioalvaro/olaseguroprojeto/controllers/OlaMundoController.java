package br.com.fabioalvaro.olaseguroprojeto.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class OlaMundoController {

    @GetMapping("/olamundo")
    public String olaMundo() {
        return "olamamae";
    }

}