package com.metrobus.sqlite.model;

public class Zona {
	
	int id_zona;
	int id_regiao;
	int id_tipotrasnporte;
	String nome;
	String zonainfo;
	String latitude;
	String longitude;
	

	public Zona() {

	}

	public Zona(int id_zona, int id_regiao, int id_tipotransporte,String nome, String zonainfo, String latitude, String longitude) {
		this.id_regiao = id_regiao;
		this.id_tipotrasnporte = id_tipotransporte;
		this.id_zona = id_zona;
		this.nome = nome;
		this.zonainfo = zonainfo;
		this.latitude= latitude;
		this.longitude=longitude;
	}

	// setter
	public void setId_zona(int id_zona) {
		this.id_zona = id_zona;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// getter
	public int getId_zona() {
		return this.id_zona;
	}

	public String getNome() {
		return this.nome;
	}
}
