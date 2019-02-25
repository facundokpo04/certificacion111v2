/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.atletismo.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import poo.atletismo.Competencia;
import poo.atletismo.Escuela;

/**
 *
 * @author fdominguez
 */
public class CompetenciaDaoHibernateImpl implements CompetenciaDao{
     
    private final SessionFactory sessionFactory;

    public CompetenciaDaoHibernateImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Competencia> obtenerTodas() {
        Session session = sessionFactory.openSession();
        List<Competencia> retorno = session.createQuery("from Competencia").list();
        session.close();
        
        return retorno;
    }
}
