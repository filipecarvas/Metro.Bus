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

}
