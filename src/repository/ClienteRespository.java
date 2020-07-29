package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

import connection.ConnectionBD;
import model.Cliente;

public class ClienteRespository {
	
	private Connection connection;  
	
	public ClienteRespository() { // construtor
		connection= ConnectionBD.getConnection(); // o metodo getConnection irá devolver uma conexão
	}
	
	public Cliente cadastrar(Cliente cliente) { 
		String sql = String.format("insert into cliente(nome, endereco, contato, email, cpf, cnpj, data) values ('%s','%s,'%s,'%s,'%s,'%s,'%s)", 
				cliente.getNome(),cliente.getEndereco(),cliente.getEmail(),cliente.getData(),cliente.getCpf(),cliente.getContato(),cliente.getCnpj());// atribuindo os %s aos atributos do BD
		// try/catch se caso houver erros, irá ser acionado
		try { 
			PreparedStatement statement= connection.prepareStatement(sql); // pegando retorno estalecendo conexão  e inserindo  
			statement.execute(sql, Statement.RETURN_GENERATED_KEYS); // retorna as chaves geradas ( ID)
			ResultSet rs = statement.getGeneratedKeys(); // retorno do ID
			
			if(rs.next()) { // para ter certeza que houve retorno do ID
				cliente.setId_orcamento((long)rs.getInt(1));
				
			}
			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		} 
		
		return cliente;
	}
	
	
	
	

}
