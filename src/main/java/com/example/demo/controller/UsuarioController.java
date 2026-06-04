package com.example.demo.controller;

import com.example.demo.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controlador MVC para gestión y visualización de usuarios.
 * Instancia objetos Usuario y los envía a vistas Thymeleaf.
 */
@Controller
public class UsuarioController {

    /**
     * Endpoint: GET /gestionUsuarios
     * Instancia un Usuario y lo envía al modelo para renderización
     * 
     * @param model objeto para pasar datos a la vista
     * @return nombre de la vista a renderizar
     */
    @GetMapping("/gestionUsuarios")
    public String gestionUsuarios(Model model) {
      
        Usuario usuario = new Usuario();
        usuario.setId(1);
        usuario.setNombre("Pool Morales");
        usuario.setCedula("1751899020");
        usuario.setCorreo("poolmorales77@gmail.com");
        
       
        model.addAttribute("usuario", usuario);
        
        return "gestionUsuarios";
    }
}
