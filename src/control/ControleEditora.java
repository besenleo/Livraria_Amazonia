package control;

import Dao.DaoEditora;
import java.util.List;
import model.Autor;
import model.Editora;
import org.hibernate.HibernateException;


public class ControleEditora {
    DaoEditora acessoHibernateEditora;

    public ControleEditora() {
        this.acessoHibernateEditora =  new DaoEditora();
    }
    
    public Integer gravarEditora(Editora editora){
        try{
            acessoHibernateEditora.gravar(editora);
            return 1;
        }catch (HibernateException e){
            e.printStackTrace();
            return 2;
        }
    }
    
    public List carregarEditora(){
        try{
            return acessoHibernateEditora.carregarTudoOrdenado(Editora.class, "nome");
        }catch (HibernateException e){ 
            e.printStackTrace();
            return null;
        }
    }
    
    public boolean excluirEditora(Editora editora) {
        try {
            acessoHibernateEditora.excluir(editora);
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean alterarEditora(Editora editora) {
        try {
            acessoHibernateEditora.alterar(editora);
            return true;
        } catch (HibernateException e) {
            e.printStackTrace();
            return false;
        }
    }
}
