package simpleCRUD;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import conectDB.Conect;
import simpleCRUD.User;

public class Main {

	public static void main(String[] args) {
		Conect conn = new Conect();

		User user = new User();
		user.startConnection();
		int addInt = user.insert("teste", "testa");
		if(addInt == 1){
			System.out.println("Usuário adicionado com sucesso");
		}else{
			System.out.println("Erro ao tentar adicionar novo usuário");
		}
		user.closeConnection();
		
		
		
		
		
		//db.closeConnection();
	}

}
