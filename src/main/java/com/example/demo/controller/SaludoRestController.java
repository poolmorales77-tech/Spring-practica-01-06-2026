package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

/**
 * Controlador REST para exponer servicios que retornan JSON.
 * Proporciona un endpoint de bienvenida con respuesta serializada.
 */
@RestController
@RequestMapping("/api")
public class SaludoRestController {

    /**
     * Endpoint: GET /api/saludo
     * Retorna un JSON con un mensaje de bienvenida
     * 
     * @return Map con el mensaje formateado como JSON
     */
    @GetMapping("/saludo")
    public Map<String, String> saludo() {
        return Collections.singletonMap("mensaje", "Hola desde Spring Boot!");
    }
}
