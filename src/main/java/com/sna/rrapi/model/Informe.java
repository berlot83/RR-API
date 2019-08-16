package com.sna.rrapi.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class Informe {

	private String dni; /* Deberia ser un objeto Persona, pero a modo de ejemplo del swagger dejo el DNI */
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate fecha;
	private TipoInforme tipo;
	private String descripcion;

	public enum TipoInforme {
		BASICO
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public TipoInforme getTipo() {
		return tipo;
	}

	public void setTipo(TipoInforme tipo) {
		this.tipo = tipo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

}
