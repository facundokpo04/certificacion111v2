package poo.atletismo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Competencia {

    private Integer id;
    private String nombre;

    private Date fecha;
    private Disciplina disciplina;
    private List<Categoria> categorias;

    public Competencia() {
        this.categorias = new ArrayList();
    }

    public Competencia(String nombre, Date fecha, Disciplina disciplina, List<Categoria> categorias) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.disciplina = disciplina;
        this.categorias = categorias;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }
 @Override
    public String toString() {
        return this.nombre;
    }
    
}
