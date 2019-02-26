/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.atletismo.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import poo.atletismo.Escuela;
import poo.atletismo.Inscripcion;

/**
 *
 * @author fdominguez
 */
public class InscripcionDaoHibernateImpl implements InscripcionDao {

    private final SessionFactory sessionFactory;

    public InscripcionDaoHibernateImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void guardar(Inscripcion inscripcion) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(inscripcion);
        session.getTransaction().commit();
        session.close();
    }

}
