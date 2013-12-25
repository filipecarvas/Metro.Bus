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

	public int getId_zona() {
		return id_zona;
	}

	public void setId_zona(int id_zona) {
		this.id_zona = id_zona;
	}

	public int getId_regiao() {
		return id_regiao;
	}

	public void setId_regiao(int id_regiao) {
		this.id_regiao = id_regiao;
	}

	public int getId_tipotrasnporte() {
		return id_tipotrasnporte;
	}

	public void setId_tipotrasnporte(int id_tipotrasnporte) {
		this.id_tipotrasnporte = id_tipotrasnporte;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getZonainfo() {
		return zonainfo;
	}

	public void setZonainfo(String zonainfo) {
		this.zonainfo = zonainfo;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}


}
