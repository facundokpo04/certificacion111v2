package poo.atletismo.controller;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.SessionFactory;
import poo.atletismo.Torneo;
import poo.atletismo.Aspirante;
import poo.atletismo.Competencia;
import poo.atletismo.Disciplina;
import poo.atletismo.Escuela;
import poo.atletismo.Inscripcion;
import poo.atletismo.dao.CompetenciaDao;
import poo.atletismo.dao.CompetenciaDaoHibernateImpl;
import poo.atletismo.dao.EscuelaDao;
import poo.atletismo.dao.EscuelasDaoHibernateImpl;

public class GestorInscripcion {

    private Inscripcion inscripcion;

    private final CompetenciaDao competenciaDao;
    private final EscuelaDao escuelaDao;

    public GestorInscripcion(SessionFactory sessionFactory) {

        // creamos las instancias de los objetos de acceso a datos
        this.competenciaDao = new CompetenciaDaoHibernateImpl(sessionFactory);
        this.escuelaDao = new EscuelasDaoHibernateImpl(sessionFactory);

    }

    public void run() {
        // obtenemos los objetos para completar las listas de seleccion
        List<Escuela> escuela = escuelaDao.obtenerTodas();
        List<Competencia> competencias = competenciaDao.obtenerTodas();
       
    }
}
