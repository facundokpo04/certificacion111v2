/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.atletismo;

import java.util.Date;

/**
 *
 * @author fdominguez
 */
public class Aspirante {

    private String id;

    private String nombres;

    private String apellido;

    private String direccion;

    private String sexo;

    private String dni;

    private Date fechaNac;

    private Escuela unaEscuela;

    public Aspirante() {
    }

    public Aspirante(String apellido, String direccion, String sexo, String dni, Date fechaNac, Escuela unaEscuela) {
        this.apellido = apellido;
        this.direccion = direccion;
        this.sexo = sexo;
        this.dni = dni;
        this.fechaNac = fechaNac;
        this.unaEscuela = unaEscuela;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public Escuela getUnaEscuela() {
        return unaEscuela;
    }

    public void setUnaEscuela(Escuela unaEscuela) {
        this.unaEscuela = unaEscuela;
    }

}
