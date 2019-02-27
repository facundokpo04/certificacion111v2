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
import poo.atletismo.dao.CompetenciaDaoImpl;
import poo.atletismo.dao.EscuelaDao;
import poo.atletismo.dao.EscuelasDaoHibernateImpl;
import poo.atletismo.dao.EscuelasDaoImpl;
import poo.atletismo.dao.InscripcionDao;
import poo.atletismo.dao.InscripcionDaoHibernateImpl;
import poo.atletismo.ui.PantallaAdministracionInscripcion;

public class GestorInscripcion {

    private Inscripcion inscripcion;

    private final CompetenciaDao competenciaDao;
    private final EscuelaDao escuelaDao;
    private final InscripcionDao inscripcionDao;

    public GestorInscripcion(SessionFactory sessionFactory) {
        // creamos el torneo

        // creamos las instancias de los objetos de acceso a datos
        this.competenciaDao = new CompetenciaDaoImpl();
        this.escuelaDao = new EscuelasDaoImpl();
        this.inscripcionDao = new InscripcionDaoHibernateImpl(sessionFactory);
    }

    public void run() {
        // obtenemos los objetos para completar las listas de seleccion
        List<Escuela> escuelas = escuelaDao.obtenerTodas();
        List<Competencia> competencias = competenciaDao.obtenerTodas();
     // creamos una instancia del formulario y lo mostramos
     PantallaAdministracionInscripcion panel = new PantallaAdministracionInscripcion(escuelas, competencias, this);
        panel.setVisible(true);
    }

    public void guardarInscripcion(Inscripcion inscripcion) {
        inscripcionDao.guardar(inscripcion);
    }
}
