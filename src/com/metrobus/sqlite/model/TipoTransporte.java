package com.metrobus.sqlite.model;

public class TipoTransporte {
	int id_TipoTransporte;
	String nome;

	public TipoTransporte() {

	}

	public TipoTransporte(int id_TipoTransporte, String nome) {
		this.id_TipoTransporte = id_TipoTransporte;
		this.nome = nome;
	}

	public int getId_TipoTransporte() {
		return id_TipoTransporte;
	}

	public void setId_TipoTransporte(int id_TipoTransporte) {
		this.id_TipoTransporte = id_TipoTransporte;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
