/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.atletismo.dao;

import java.util.ArrayList;
import java.util.List;
import poo.atletismo.Escuela;

/**
 *
 * @author fdominguez
 */
public class EscuelasDaoImpl implements EscuelaDao{
       private final List<Escuela> escuelas;

    public EscuelasDaoImpl() {
        this.escuelas = new ArrayList<>();
        this.escuelas.add(new Escuela("Lucio Lucero"));
        this.escuelas.add(new Escuela("Bop 789"));
        this.escuelas.add(new Escuela("Colegio Americano"));
    }

    @Override
    public List<Escuela> obtenerTodas() {
        return escuelas;
    }
}
