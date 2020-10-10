package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ConexaoBD;
import model.Editora;

public class EditoraDao {
    private ConexaoBD conexao;

    public EditoraDao() {        
    }
    
    public ArrayList<Editora> adcEditoras() throws SQLException, ClassNotFoundException{
        try{String SQL = "SELECT * FROM publishers;";
            PreparedStatement ps = conexao.getConection().prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            ArrayList<Editora> editoras = new ArrayList<Editora>();
            while(rs.next()){
                Editora edit = new Editora();
                edit.setIdEditora(rs.getInt("publisher_id"));
                edit.setNome(rs.getString("name"));
                edit.setUrl(rs.getString("url"));
                editoras.add(edit);
            }
            rs.close();
            return editoras;
        }
        catch (ClassNotFoundException e){
            throw new ClassNotFoundException("Driver JDBC do PostgreSQL não localizado: " + e.getMessage());
        }
        catch (SQLException e){
            throw new SQLException( "Não foi possivel conectar com o banco de dados: ");
        }

    }
}
