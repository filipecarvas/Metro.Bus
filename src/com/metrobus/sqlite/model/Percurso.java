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
	
	public void setHora(String hora) {
		this.hora = hora;
	}
	
	public String getHora() {
		return this.hora;
	}

	public int getId_zona() {
		return id_zona;
	}

	public void setId_zona(int id_zona) {
		this.id_zona = id_zona;
	}

	public int getId_percurso() {
		return id_percurso;
	}

	public void setId_percurso(int id_percurso) {
		this.id_percurso = id_percurso;
	}

	public int getId_tipotrasnporte() {
		return id_tipotrasnporte;
	}

	public void setId_tipotrasnporte(int id_tipotrasnporte) {
		this.id_tipotrasnporte = id_tipotrasnporte;
	}

	public String getOrdem() {
		return ordem;
	}

	public void setOrdem(String ordem) {
		this.ordem = ordem;
	}
	
	
}
