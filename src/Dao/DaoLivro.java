package Dao;

import java.util.List;
import org.hibernate.HibernateException;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import model.Livro;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;


public class DaoLivro extends DaoBasico{
    
    public DaoLivro(){
    }
    
    @Override
    public List carregarTudoOrdenado(Class clas, String ordem) throws HibernateException {
        Session session = hibernateConfig.openSession();
        Criteria criteria = session.createCriteria(clas);
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);// Evitar duplicadas
        List lista = criteria.list();
        session.close();
        return lista;
    }
}
