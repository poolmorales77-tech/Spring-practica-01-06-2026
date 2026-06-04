package com.example.demo.model;

public class Usuario {
    private Integer id;
    private String nombre;
    private String cedula;
    private String correo;
    private String clave;
    private Integer estadoCivil;
    private Integer perfil;

    // Constructor vacío
    public Usuario() {
    }

    // Constructor con parámetros
    public Usuario(Integer id, String nombre, String cedula, String correo, String clave, Integer estadoCivil, Integer perfil) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
        this.clave = clave;
        this.estadoCivil = estadoCivil;
        this.perfil = perfil;
    }

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Integer getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(Integer estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Integer getPerfil() {
        return perfil;
    }

    public void setPerfil(Integer perfil) {
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", correo='" + correo + '\'' +
                ", clave='" + clave + '\'' +
                ", estadoCivil=" + estadoCivil +
                ", perfil=" + perfil +
                '}';
    }
}
