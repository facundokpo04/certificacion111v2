/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.atletismo.controller;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
/**
 *
 * @author fdominguez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SessionFactory sessionFactory = null;
        
        // A SessionFactory is set up once for an application!
	final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
			.configure("resources/hibernate.cfg.xml") // configures settings from hibernate.cfg.xml
			.build();
	try {
            sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
            new GestorInscripcion(sessionFactory).run();
	}
	catch (Exception e) {
            System.out.println("Error al crear factory: " + e.getMessage());

            // The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
            // so destroy it manually.
            StandardServiceRegistryBuilder.destroy( registry );
	}
        
        
    }
    }
    

