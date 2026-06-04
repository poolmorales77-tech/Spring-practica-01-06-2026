package com.example.demo.controller;

import com.example.demo.model.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

/**
 * Controlador REST para gestión de usuarios.
 * Expone endpoints que retornan datos de usuario en formato JSON.
 */
@RestController
@RequestMapping("/api/v1")
public class UsuarioRestController {

    /**
     * Endpoint: GET /api/v1/usuarios
     * Retorna los datos de un usuario en formato JSON
     * 
     * @return Map con objeto Usuario serializado a JSON
     */
    @GetMapping("/usuarios")
    public Map<String, Usuario> obtenerUsuario() {
        // Crear instancia de Usuario con datos específicos
        Usuario usuario = new Usuario(
            1,
            "Pool Morales",
            "1751899020",
            "poolmorales77@gmail.com",
            "Minerva1@",
            2,
            1
        );
        
        // Retornar Usuario envuelto en estructura JSON
        return Collections.singletonMap("Usuario", usuario);
    }
}
