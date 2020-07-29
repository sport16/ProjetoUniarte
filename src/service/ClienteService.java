package service;

import model.Cliente;
import repository.ClienteRespository;

public class ClienteService {
	
	private ClienteRespository clienteRespository;
	
	public ClienteService() {
		clienteRespository=new ClienteRespository();
	}
	
	public Cliente cadastrar(Cliente cliente) {
		return clienteRespository.cadastrar(cliente);
	}
	
	

}
