package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controlador MVC para mostrar información dinámica del sistema.
 * Expone atributos al modelo para ser renderizados en la vista Thymeleaf.
 */
@Controller
public class InformacionController {

    /**
     * Endpoint: GET /informacion
     * Expone parámetros dinámicos al modelo Thymeleaf
     * 
     * @param model objeto para pasar datos a la vista
     * @return nombre de la vista a renderizar
     */
    @GetMapping("/informacion")
    public String informacion(Model model) {
        model.addAttribute("titulo", "Información del Sistema");
        model.addAttribute("app", "Spring Boot Application");
        model.addAttribute("ip", "127.0.0.1");
        
        return "informacion";
    }
}
