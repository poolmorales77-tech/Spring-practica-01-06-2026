package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controlador MVC para demostrar conectividad básica del servidor.
 * Renderiza la vista saludo.html con un mensaje estático.
 */
@Controller
public class SaludoController {

    /**
     * Endpoint: GET /saludo
     * Retorna la vista saludo.html con mensaje "Servidor Activo!!"
     * 
     * @return nombre de la vista a renderizar
     */
    @GetMapping("/saludo")
    public String saludo() {
        return "saludo";
    }
}
