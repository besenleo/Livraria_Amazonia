package control;

import Dao.DaoAutor;
import java.util.List;
import model.Autor;
import org.hibernate.HibernateException;

public class ControleAutor {
    DaoAutor acessohibernateautor;
    
    public ControleAutor(){
        acessohibernateautor = new DaoAutor();
    }
    
    public int gravarAutor(Autor autor){
        try{
            acessohibernateautor.gravar(autor);
            System.out.println(autor);
            return 1;
        }catch (HibernateException e){
            e.printStackTrace();
            return 2;
        }
    }
    
    public List carregarAutores(){
        try{
            return acessohibernateautor.carregarTudoOrdenado(Autor.class, "nome");
        }catch (HibernateException e){ 
            e.printStackTrace();
            return null;
        }
    }
    
    public boolean excluirAutor(Autor autor) {
        try {
            acessohibernateautor.excluir(autor);
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean alterarAutor(Autor autor) {
        try {
            acessohibernateautor.alterar(autor);
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }
    }
}
