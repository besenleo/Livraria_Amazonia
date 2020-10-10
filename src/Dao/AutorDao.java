package Dao;
       
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Autor;
import model.ConexaoBD;

public class AutorDao {
    private ConexaoBD conexao;

    public AutorDao() {
    }
    
    
    public ArrayList<Autor> listarAutores() throws SQLException, ClassNotFoundException{
        try{
            String SQL = "SELECT * FROM authors;";
            PreparedStatement ps = conexao.getConection().prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            ArrayList<Autor> autores = new ArrayList<Autor>();
            while(rs.next()){
                Autor aut = new Autor();
                aut.setId(rs.getInt("author_id"));
                aut.setNome(rs.getString("name"));
                aut.setFnome(rs.getString("fname"));
                autores.add(aut);   
            }
            ps.close();
            return autores;
        }
        catch (ClassNotFoundException e){
            throw new ClassNotFoundException("Driver JDBC do PostgreSQL não localizado: " + e.getMessage());
        }
        catch (SQLException e){
            throw new SQLException( "Não foi possivel conectar com o banco de dados: ");
        }   
    }
}
