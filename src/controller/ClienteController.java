package controller;

import model.Cliente;
import service.ClienteService;

public class ClienteController {
	
	private ClienteService clienteService;
	
	public ClienteController() {
		clienteService = new ClienteService();
	}
	
	public Cliente cadastrar(Cliente cliente) {
		return clienteService.cadastrar(cliente);
	}
	

}
