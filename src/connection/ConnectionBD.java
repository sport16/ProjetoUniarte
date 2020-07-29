package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBD {
	
	private ConnectionBD() { // está private para que nenhum outro programador crie/altere outro objeto ConnectionBD
		
	}
	
	public static Connection getConnection() { // caso ocorra algum erro com conexão ao BD, o try/catch irá aparecer
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/cliente_teste","root", ""); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
		
	}

}
