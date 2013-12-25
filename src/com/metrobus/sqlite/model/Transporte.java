package com.metrobus.sqlite.model;

public class Transporte {
	int id_trasnporte;
	int id_tipotrasnporte;
	String numero_linha;
	String sentido;

	

	public Transporte() {

	}

	public Transporte(int id_trasnporte,  int id_tipotransporte,String numero_linha, String sentido) {
		this.id_trasnporte = id_trasnporte;
		this.id_tipotrasnporte = id_tipotransporte;
		this.numero_linha = numero_linha;
		this.sentido = sentido;
	}

	public int getId_trasnporte() {
		return id_trasnporte;
	}

	public void setId_trasnporte(int id_trasnporte) {
		this.id_trasnporte = id_trasnporte;
	}

	public int getId_tipotrasnporte() {
		return id_tipotrasnporte;
	}

	public void setId_tipotrasnporte(int id_tipotrasnporte) {
		this.id_tipotrasnporte = id_tipotrasnporte;
	}

	public String getNumero_linha() {
		return numero_linha;
	}

	public void setNumero_linha(String numero_linha) {
		this.numero_linha = numero_linha;
	}

	public String getSentido() {
		return sentido;
	}

	public void setSentido(String sentido) {
		this.sentido = sentido;
	}
}
