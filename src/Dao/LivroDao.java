package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ConexaoBD;
import model.Livro;

public class LivroDao {
    private ConexaoBD conexao;

    public LivroDao() {
    }
    
    public ArrayList<Livro> listaLivros() throws SQLException, ClassNotFoundException{
        try{String SQL = "SELECT * FROM books;";
            PreparedStatement ps = conexao.getConection().prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            ArrayList<Livro> livros = new ArrayList<Livro>();
            while(rs.next()){
                Livro liv = new Livro();
                liv.setTitulo(rs.getString("title"));
                liv.setIsbn(rs.getString("isbn"));
                liv.setIdEditora(rs.getInt("publisher_id"));
                liv.setPreco(rs.getFloat("preco"));
                livros.add(liv);
                }
            rs.close();
            return livros;
            }
        
        catch (ClassNotFoundException e){
            throw new ClassNotFoundException("Driver JDBC do PostgreSQL não localizado: " + e.getMessage());
        }
        catch (SQLException e){
            throw new SQLException( "Não foi possivel conectar com o banco de dados: ");
        }
    }
}
