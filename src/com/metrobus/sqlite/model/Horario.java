package com.metrobus.sqlite.model;

//

public class Horario {
	int id_horario;
	int id_zona;
	int id_trasnporte;
	int id_tipotrasnporte;
	String horario;

	

	public Horario() {

	}

	public Horario(int id_horario, int id_zona, int id_trasnporte,int id_tipotransporte, String horario) {
		this.id_horario = id_horario;
		this.id_trasnporte = id_trasnporte;
		this.id_tipotrasnporte = id_tipotransporte;
		this.id_zona = id_zona;
		this.horario = horario;
	}

	public int getId_horario() {
		return id_horario;
	}

	public void setId_horario(int id_horario) {
		this.id_horario = id_horario;
	}

	public int getId_zona() {
		return id_zona;
	}

	public void setId_zona(int id_zona) {
		this.id_zona = id_zona;
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

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	

}
