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
        if(this.conect != null){
            String sqlCommand = "INSERT INTO users VALUES (default, ?, ?)";
            try{
                PreparedStatement ps = this.conect.prepareStatement(sqlCommand);
                ps.setString(1, name);
                ps.setString(2, surname);
                return ps.executeUpdate();
                
            }catch(SQLException e) {
                throw new DBException(e.getMessage());
            }
        }else{
            System.out.println("Sem conexão com o banco de dados");
            return 0;
        }
        //throw new UnsupportedOperationException("Unimplemented method 'insert'");
    }
    
    @Override
    public ResultSet getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
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