package com.sna.rrapi.model;

import java.util.List;

public class Joven extends Persona {
	
	private String legajo;
	private String apellidoMaterno;
	private List<Referente> referentes;
	private String paisNacimiento;
	private String municipalidadNacimiento;
	private String barrioNacimiento;
	private TipoTrabajo tipoTrabajo;
	private List<Proceso> procesos;
	private List<Informe> informes;
	private Escolaridad escolaridad;

	public enum TipoTrabajo {
		DESOCUPADO, RELACION_DEPENDENCIA, INDEPENDIENTE, TEMPORAL, OTRO
	}

	public List<Proceso> getProcesos() {
		return procesos;
	}

	public void setProcesos(List<Proceso> procesos) {
		this.procesos = procesos;
	}

	public List<Informe> getInformes() {
		return informes;
	}

	public void setInformes(List<Informe> informes) {
		this.informes = informes;
	}

	public Escolaridad getEscolaridad() {
		return escolaridad;
	}

	public void setEscolaridad(Escolaridad escolaridad) {
		this.escolaridad = escolaridad;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public List<Referente> getReferentes() {
		return referentes;
	}

	public void setReferentes(List<Referente> referentes) {
		this.referentes = referentes;
	}

	public String getPaisNacimiento() {
		return paisNacimiento;
	}

	public void setPaisNacimiento(String paisNacimiento) {
		this.paisNacimiento = paisNacimiento;
	}

	public String getMunicipalidadNacimiento() {
		return municipalidadNacimiento;
	}

	public void setMunicipalidadNacimiento(String municipalidadNacimiento) {
		this.municipalidadNacimiento = municipalidadNacimiento;
	}

	public String getBarrioNacimiento() {
		return barrioNacimiento;
	}

	public void setBarrioNacimiento(String barrioNacimiento) {
		this.barrioNacimiento = barrioNacimiento;
	}

	public TipoTrabajo getTipoTrabajo() {
		return tipoTrabajo;
	}

	public void setTipoTrabajo(TipoTrabajo tipoTrabajo) {
		this.tipoTrabajo = tipoTrabajo;
	}
}
