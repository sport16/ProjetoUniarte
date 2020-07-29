package model;

import java.util.Date;

public class Cliente {
	
	private long id_orcamento; // identificador de controle do orçamento do cliente
	private String nome; 
	private String endereco;
	private String contato;
	private String email;
	private String cpf;
	private String cnpj;
	private Date data;
	

	//Gets e Sets da classe Cliente

	public long getId_orcamento() {
		return id_orcamento;
	}

	public void setId_orcamento(long id_orcamento) {
		this.id_orcamento = id_orcamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Cliente \nId_orcamento= " + id_orcamento + ",\nNome= " + nome + ",\nEndereco= " + endereco + ",\nContato= "
				+ contato + ",\nE-mail= " + email + ",\nCpf= " + cpf + ",\nCnpj= " + cnpj + ",\nData= " + data + "";
	}
	
	
	
	

}
