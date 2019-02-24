package poo.atletismo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Torneo {

    private Integer id;
    private Date fecha;
    private List<Escuela> escuelas;
    private List<Competencia> competencias;

    public Torneo() {
        this.escuelas = new ArrayList();
        this.competencias = new ArrayList();

    }

    public Torneo(Date fecha, List<Escuela> escuelas, List<Competencia> competencias) {
        this.fecha = fecha;
        this.escuelas = escuelas;
        this.competencias = competencias;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public List<Escuela> getEscuelas() {
        return escuelas;
    }

    public void setEscuelas(List<Escuela> escuelas) {
        this.escuelas = escuelas;
    }

    public List<Competencia> getCompetencias() {
        return competencias;
    }

    public void setCompetencias(List<Competencia> competencias) {
        this.competencias = competencias;
    }

}
