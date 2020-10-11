package Dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;

public class DaoBasico {
    protected HibernateConfig hibernateConfig;
    
    public DaoBasico(){
        hibernateConfig = new HibernateConfig();
    }
    
    public void gravar(Object obj) throws HibernateException {
        Session session = hibernateConfig.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(obj);transaction.commit();
        session.close();
    }
    
    public void alterar(Object obj) throws HibernateException {
        Session session = hibernateConfig.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(obj);
        transaction.commit();
        session.close();
    }
    
    public void excluir(Object obj) throws HibernateException {
        Session session = hibernateConfig.openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(obj);
        transaction.commit();
        session.close();
    }
    
    public List carregarTudoOrdenado(Class clas, String ordem) throws HibernateException {
        Session session = hibernateConfig.openSession();
        Criteria criteria = session.createCriteria(clas);
        criteria.addOrder(Order.asc(ordem));
        List lista = criteria.list();
        session.close();
        return lista;
    }
}
