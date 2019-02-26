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

/**
 *
 * @author fdominguez
 */
public class InscripcionDaoHibernateImpl implements EscuelaDao{
     
    private final SessionFactory sessionFactory;

    public InscripcionDaoHibernateImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Escuela> obtenerTodas() {
        Session session = sessionFactory.openSession();
        List<Escuela> retorno = session.createQuery("from Escuela").list();
        session.close();
        
        return retorno;
    }
}
