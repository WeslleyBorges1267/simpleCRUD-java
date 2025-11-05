package simpleCRUD;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import conectDB.Conect;
import personalExceptions.DBException;
import simpleCRUD.User;

public class Main {

	public static void main(String[] args) {

		User user = new User();
		
		try{
			ResultSet rsa = user.getAll();
			while(rsa.next()){
				System.out.printf("Olá %s %s", rsa.getString(2), rsa.getString(3));
			}
		}catch(SQLException e){
			throw new DBException(e.getMessage());
		}
		//db.closeConnection();
	}

}
