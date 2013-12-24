package com.metrobus.sqlite.model;

public class Percurso {

	int id_zona;
	int id_percurso;
	int id_tipotrasnporte;
	String ordem;
	String hora;

	

	public Percurso() {

	}

	public Percurso(int id_percurso, int id_zona, int id_tipotransporte,String ordem, String hora) {
		this.id_percurso = id_percurso;
		this.id_tipotrasnporte = id_tipotransporte;
		this.id_zona = id_zona;
		this.ordem = ordem;
		this.hora = hora;
	}
}
