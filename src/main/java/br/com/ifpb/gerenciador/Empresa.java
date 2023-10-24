package br.com.ifpb.gerenciador;

import java.util.Date;

public class Empresa {
	private static int chaveSequencial=1;
	private int id;
	private String nome;
	private String cnpj;
	private Date dataAbertura = new Date();
	

	public Empresa(String nome, String cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.id=chaveSequencial;
		System.out.println("Chave: - " + chaveSequencial);
		chaveSequencial++;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public int getId() {
		return id;
	}	
	

}
