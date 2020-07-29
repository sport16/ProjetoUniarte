package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBD {
	
	private ConnectionBD() { // est� private para que nenhum outro programador crie/altere outro objeto ConnectionBD
		
	}
	
	public static Connection getConnection() { // caso ocorra algum erro com conex�o ao BD, o try/catch ir� aparecer
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost/cliente_teste","root", ""); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
		
	}

}
