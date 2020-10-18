package control;

import Dao.DaoLivro;
import java.util.List;
import model.Livro;
import org.hibernate.HibernateException;


public class ControleLivro {
    DaoLivro acessohibernatelivro;
    
    public ControleLivro(){
        acessohibernatelivro = new DaoLivro();
    }
    
    public int gravarLivro(Livro livro){
        try{
            acessohibernatelivro.gravar(livro);
            return 1;
        }catch (HibernateException e){
            e.printStackTrace();
            return 2;
        }
    }
    
    public List carregarLivros(){
        try{
            return acessohibernatelivro.carregarTudoOrdenado(Livro.class, "titulo");
        }catch (HibernateException e){ 
            e.printStackTrace();
            return null;
        }
    }
    
    public boolean excluirLivro(Livro livro) {
        try {
            acessohibernatelivro.excluir(livro);
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean alterarLivro(Livro livro) {
        try {
            acessohibernatelivro.alterar(livro);
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }
    }
}
