package com.metrobus.sqlite.model;

public class Regiao {
	
	int id_regiao;
	String nome;

	public Regiao() {

	}

	public Regiao(int id_regiao, String nome) {
		this.id_regiao = id_regiao;
		this.nome = nome;
	}

	// setter
	public void setId_regiao(int id_regiao) {
		this.id_regiao = id_regiao;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// getter
	public int getId_regiao() {
		return this.id_regiao;
	}

	public String getNome() {
		return this.nome;
	}

}
