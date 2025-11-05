package conectDB;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import personalExceptions.DBException;

public class Conect {
	
	protected Connection conect;
	
	private Properties props() {
		Properties props = null;
		try {
			FileInputStream readFile = new FileInputStream("db.properties");
			props = new Properties();
			props.load(readFile);
			System.out.println("Leitura de dados realizada com sucesso");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return props;
	}
	
	public void startConnection() {
		try {
			Properties props = this.props();
			this.conect = DriverManager.getConnection(props.getProperty("url"), props);
			System.out.println("Conectado ao banco com sucesso");
		}catch(SQLException e) {
			System.out.println("Erro ao conectar ao banco de dados:");
			throw new DBException(e.getMessage());
		}
	}
	
	public void closeConnection() {
		try {
			if(this.conect != null) {
				conect.close();
				System.out.println("Conexão fechada com sucesso");
			}else {
				System.out.println("Nenhuma conexão aberta para ser fechada");
			}
		}catch(SQLException e) {
			throw new DBException(e.getMessage());
		}
	}
	
}