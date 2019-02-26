/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.atletismo.dao;

import java.util.ArrayList;
import java.util.List;
import poo.atletismo.Escuela;
import poo.atletismo.Inscripcion;

/**
 *
 * @author fdominguez
 */
public class InscripcionDaoImpl implements InscripcionDao{
   private final List<Inscripcion> inscripciones;

    public InscripcionDaoImpl() {
        this.inscripciones = new ArrayList<>();
   
    }

    @Override
    public void guardar(Inscripcion inscripcion) {
          this.inscripciones.add(inscripcion);
        
        System.out.println("Inscripcion agregada: " + inscripcion);
    }

   

  
}
