package com.sna.rrapi.model;

import org.springframework.format.annotation.DateTimeFormat;

public class Intervencion {
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private String fecha;
	private String centroAsistencia;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private String fechaCese;
	private String motivoCese;

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getCentroAsistencia() {
		return centroAsistencia;
	}

	public void setCentroAsistencia(String centroAsistencia) {
		this.centroAsistencia = centroAsistencia;
	}

	public String getFechaCese() {
		return fechaCese;
	}

	public void setFechaCese(String fechaCese) {
		this.fechaCese = fechaCese;
	}

	public String getMotivoCese() {
		return motivoCese;
	}

	public void setMotivoCese(String motivoCese) {
		this.motivoCese = motivoCese;
	}
}
