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
}
