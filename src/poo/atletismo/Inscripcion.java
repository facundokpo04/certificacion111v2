package poo.atletismo;

import java.util.Date;

public class Inscripcion {

    private Integer numero;
    private Date fecha;
    private String estado;
    private Aspirante competidor;
    private Competencia competencia;
    private Categoria categoria;

    public Inscripcion(Date fecha) {
        this.fecha = fecha;
    }

    public Inscripcion(Integer numero, Date fecha, String estado, Aspirante competidor, Competencia competencia, Categoria categoria) {
        this.numero = numero;
        this.fecha = fecha;
        this.estado = estado;
        this.competidor = competidor;
        this.competencia = competencia;
        this.categoria = categoria;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Aspirante getCompetidor() {
        return competidor;
    }

    public void setCompetidor(Aspirante competidor) {
        this.competidor = competidor;
    }

    public Competencia getCompetencia() {
        return competencia;
    }

    public void setCompetencia(Competencia competencia) {
        this.competencia = competencia;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    

}
