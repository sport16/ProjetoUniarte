
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import controller.ClienteController;
import model.Cliente;

public class Principal {

	public static void main(String[] args) {
		
		ClienteController clienteController= new ClienteController();
		Cliente cliente = new Cliente();
		Date data = new Date();
		
		cliente.setNome("Julio");
		cliente.setCpf("114.321.456-65");
		cliente.setId_orcamento(1l);
		cliente.setEndereco("Rua setima companhia");
		cliente.setData(data);
		cliente.setContato("819999999");
		
		Cliente clienteRetorno = clienteController.cadastrar(cliente);
		
		System.out.println(clienteRetorno.toString());
	}

}
