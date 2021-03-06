package Dao;

import model.Autor;
import model.Editora;
import model.Livro;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateConfig {
    private static SessionFactory sessionFactory;
    
    public HibernateConfig(){}
    
    public Session openSession() {
        if (sessionFactory == null) {
            criaSessionFactory();
        }return sessionFactory.openSession();
    }
    
    public void criaSessionFactory() {
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Autor.class);
        configuration.addAnnotatedClass(Editora.class);
        configuration.addAnnotatedClass(Livro.class);
        ServiceRegistry serviceRegistry  = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    }
}
