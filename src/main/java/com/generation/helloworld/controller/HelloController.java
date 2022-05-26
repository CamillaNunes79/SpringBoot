package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

@GetMapping	
	public String helloWorld() {
		return "Hello World!!!";
	}
@GetMapping ("/BSM")
public String BSM() {
	return "<b>Mentalidade de Crescimento; Orientação aos Detalhes; Persistência; Responsabilidade Pessoal; Orientação ao Futuro; Comunicação; Protatividade e Trabalho em equipe</b>";
	}
@GetMapping ("/objetivos")
public String objetivos() {
	return "Meu objetivo é aprende mais sobre a API SpringBoot";
    }

}

