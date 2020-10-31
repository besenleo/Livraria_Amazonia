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
}
