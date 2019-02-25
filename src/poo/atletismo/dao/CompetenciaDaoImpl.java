/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.atletismo.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import poo.atletismo.Categoria;
import poo.atletismo.Competencia;
import poo.atletismo.Disciplina;
import poo.atletismo.Escuela;

/**
 *
 * @author fdominguez
 */
public class CompetenciaDaoImpl implements CompetenciaDao {

    private final List<Competencia> competencias;
    private List<Categoria> categorias;

    public CompetenciaDaoImpl() {
        this.competencias = new ArrayList<>();
        this.categorias = new ArrayList<>();

        this.categorias.add(new Categoria("Infantiles Varones", 12, 14, "M"));
        this.categorias.add(new Categoria("Infantiles Mujeres", 12, 14, "F"));
        this.categorias.add(new Categoria("Menores Varones", 15, 17, "M"));
        this.categorias.add(new Categoria("Menores Mujeres", 15, 17, "M"));

        this.competencias.add(new Competencia("100 metros llanos", new Date(),
                new Disciplina("100 metros llanos", "100 mts"), this.categorias));
        this.competencias.add(new Competencia("300 metros con posta", new Date(),
                new Disciplina("300 metros posta", "300 metros con posta"), this.categorias));
        this.competencias.add(new Competencia("500 metros con posta", new Date(),
                new Disciplina("500 metros con posta", "500 metros con posta"), this.categorias));
        this.competencias.add(new Competencia("Salto en largo", new Date(),
                new Disciplina("Salto en largo", "Salto en largo"), this.categorias));

    }

    @Override
    public List<Competencia> obtenerTodas() {
        return competencias;
    }
}
