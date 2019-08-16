package com.sna.rrapi.config;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sna.rrapi.model.Domicilio;
import com.sna.rrapi.model.Escolaridad;
import com.sna.rrapi.model.Informe;
import com.sna.rrapi.model.Joven;
import com.sna.rrapi.model.Persona;
import com.sna.rrapi.model.Referente;

@Configuration
public class ContextConfig {

	@Bean(name = "domicilio")
	public Domicilio domicilio() {
		Domicilio domicilio = new Domicilio();
		domicilio.setDni("48123567"); /* Usado provisoriamente para relacionar, debería LLevar un OBJETO */
		domicilio.setMunicipalidad("GCBA");
		domicilio.setBarrio("Montserrat");
		domicilio.setProvincia("Capital Federal");
		domicilio.setCodigoPostal("1155");
		return domicilio;
	}

	@Bean(name = "escolaridad")
	public Escolaridad escolaridad() {
		Escolaridad escolaridad = new Escolaridad();
		escolaridad.setDni("48123567"); /* Usado provisoriamente para relacionar, debería LLevar un OBJETO */
		return escolaridad;
	}

	@Bean(name = "joven")
	public Joven joven() {
		Joven joven = new Joven();
		joven.setLegajo("123456");
		joven.setApellido("García");
		joven.setApellidoMaterno("González");
		joven.setNombre("Mariano");
		joven.setNacionalidad(Persona.Nacionalidad.ARGENTINO);
		joven.setNacimiento(LocalDate.of(1983, 04, 06));
		joven.setBarrioNacimiento("Mataderos");
		joven.setPaisNacimiento("Argentina");
		joven.setDni("48123567");
		joven.setEstadoCivil(Persona.EstadoCivil.SOLTERO);
		joven.setGenero(Persona.Genero.MASCULINO);
		joven.setMunicipalidadNacimiento("Municipalidad de La Plata");
		joven.setDomicilio(domicilio());
		joven.setEscolaridad(escolaridad());
		joven.setReferentes(referentes());
		joven.setInformes(informes());
		return joven;
	}

	@Bean(name = "referente1")
	public Referente referente1() {
		Referente referente = new Referente();
		referente.setApellido("Machado");
		referente.setDni("20890765");
		referente.setNombre("Marcelo");
		referente.setGenero(Persona.Genero.MASCULINO);
		referente.setEstadoCivil(Persona.EstadoCivil.SEPARADO);
		referente.setNacionalidad(Persona.Nacionalidad.ARGENTINO);
		return referente;
	}

	@Bean(name = "referente2")
	public Referente referente2() {
		Referente referente = new Referente();
		referente.setApellido("Morales");
		referente.setDni("24876987");
		referente.setNombre("Laura");
		referente.setGenero(Persona.Genero.FEMENINO);
		referente.setEstadoCivil(Persona.EstadoCivil.SEPARADO);
		referente.setNacionalidad(Persona.Nacionalidad.ARGENTINO);
		return referente;
	}

	@Bean(name = "referentes")
	public List<Referente> referentes() {
		List<Referente> list = new ArrayList<>();
		list.add(referente1());
		list.add(referente2());
		return list;
	}

	@Bean(name = "informe1")
	public Informe informe1() {
		Informe informe = new Informe();
		informe.setDni("48123567"); /* Usado provisoriamente para relacionar, debería LLevar un OBJETO */;
		informe.setFecha(LocalDate.of(2019, 5, 7));
		informe.setDescripcion("Detención temprana");
		informe.setTipo(Informe.TipoInforme.BASICO);
		return informe;
	}
	
	@Bean(name = "informe2")
	public Informe informe2() {
		Informe informe = new Informe();
		informe.setDni("48123567"); /* Usado provisoriamente para relacionar, debería LLevar un OBJETO */;
		informe.setFecha(LocalDate.of(2019, 9, 5));
		informe.setDescripcion("Detención final");
		informe.setTipo(Informe.TipoInforme.BASICO);
		return informe;
	}

	@Bean(name = "informes")
	public List<Informe> informes() {
		List<Informe> list = new ArrayList<>();
		list.add(informe1());
		list.add(informe2());
		return list;
	}
}
