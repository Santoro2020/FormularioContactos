package com.cesar.formulariocontactos;

public class Contacto {
    private String nombre;
    private String fechanac;
    private String telefono;
    private String email;
    private String descripcion;

    public Contacto(String nombre, String fechanac, String telefono, String email, String descripcion) {
        this.nombre = nombre;
        this.fechanac = fechanac;
        this.telefono = telefono;
        this.email = email;
        this.descripcion = descripcion;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechanac() {
        return fechanac;
    }

    public void setFechanac(String fechanac) {
        this.fechanac = fechanac;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}

