package com.sna.rrapi.model;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

public abstract class Persona {

	private String dni;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate nacimiento;
	private String nombre;
	private String apellido;
	private Genero genero;
	private TipoDocumento tipoDocumento;
	private Nacionalidad nacionalidad;
	private EstadoCivil estadoCivil;
	private Domicilio domicilio;
	
	public enum Genero {
		MASCULINO, FEMENINO, TRANSGENERO
	}

	public enum TipoDocumento {
		DNI, CUIT, PASAPORTE, DU
	}

	public enum Nacionalidad {
		ARGENTINO, OTRO
	}

	public enum EstadoCivil {
		SOLTERO, CASADO, DIVORCIADO, VIUDO, CONCUBINATO, SEPARADO
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public LocalDate getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(LocalDate nacimiento) {
		this.nacimiento = nacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(Nacionalidad nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

}
