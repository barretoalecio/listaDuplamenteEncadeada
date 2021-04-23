package models;

import utils.IdIncrement;

public class Passageiro {
	private Long id;
	private String nome;
	
	public Passageiro(String nome) {
		this.nome = nome;
		this.id = IdIncrement.getCode();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Passageiro [id=" + id + ", nome=" + nome + "]";
	}
	
}
