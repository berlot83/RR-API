package com.sna.rrapi.model;

public class Referente extends Persona {
	private TipoReferente tipoReferente;

	public enum TipoReferente {
		MADRE, PADRE, PRIMO, HERMANO, AMIGO, CONOCIDO, PADRASTRO
	}

	public TipoReferente getTipoReferente() {
		return tipoReferente;
	}

	public void setTipoReferente(TipoReferente tipoReferente) {
		this.tipoReferente = tipoReferente;
	}

}
