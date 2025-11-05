package simpleCRUD;

import java.sql.ResultSet;

import conectDB.Conect;
import interfaces.UserDAO;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import personalExceptions.DBException;


public class User extends Conect implements UserDAO{

    @Override
    public int insert(String name, String surname) {
        // Comandos para inserção de dados no banco
        String sqlCommand = "INSERT INTO users VALUES (default, ?, ?)";
        try{
            this.startConnection();
            PreparedStatement ps = this.conect.prepareStatement(sqlCommand);
            ps.setString(1, name);
            ps.setString(2, surname);
            return ps.executeUpdate();   
        }catch(SQLException e) {
            throw new DBException(e.getMessage());
        }finally{
            this.closeConnection();
        }

        //throw new UnsupportedOperationException("Unimplemented method 'insert'");
    }
    
    @Override
    public ResultSet getAll() {
        
        String sqlCommand = "SELECT * FROM users";
        try{
            this.startConnection();
            Statement st = this.conect.createStatement();
            ResultSet rs = st.executeQuery(sqlCommand);
            return rs;
        }catch(SQLException e){
            throw new DBException(e.getMessage());
        }finally{
            this.closeConnection();
        }
    }

    @Override
    public ResultSet getById() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public int update() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public int delete() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}