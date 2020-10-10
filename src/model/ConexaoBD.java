package model;

import java.util.Properties;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {

    private static final String USUARIO = "postgres";
    private static final String SENHA = "Leonardo";

    private static final String HOST = "localhost";
    private static final String DATABASE = "Database_Livraria_Amazonia";

    public static Connection getConection() throws ClassNotFoundException, SQLException{
        try{
            Class.forName("org.postgresql.Driver");

            String url = "jdbc:postgresql://" + HOST + "/" + DATABASE;
            Properties props =  new Properties();
            props.setProperty("user", USUARIO);
            props.setProperty("password", SENHA);
        
            return DriverManager.getConnection(url, props);
        }catch (ClassNotFoundException e){
            throw new ClassNotFoundException("Driver JDBC do PostgreSQL não localizado: " + e.getMessage());
        }catch (SQLException e){
            throw new SQLException( "Não foi possivel conectar com o banco de dados: " + DATABASE + e.getMessage());
        }
        
    }
}
