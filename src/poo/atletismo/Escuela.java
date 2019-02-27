package poo.atletismo;

import java.util.ArrayList;
import java.util.List;

public class Escuela {
    private Integer id;

    private String nombre;
    
    private List<Aspirante> aspirantes;

    public Escuela() {
        this.aspirantes = new ArrayList();
    }
    
    public Escuela(String nombre) {
        this.nombre = nombre;
    }

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

    public List<Aspirante> getAspirantes() {
        return aspirantes;
    }

    public void setAspirantes(List<Aspirante> aspirantes) {
        this.aspirantes = aspirantes;
    }
 @Override
    public String toString() {
        return this.nombre;
    }
   
}
