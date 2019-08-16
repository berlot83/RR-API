package com.sna.rrapi.services;

import java.util.List;

public interface PersonaService<Persona>{
	public Persona save(Persona persona);
	public Persona update(Persona persona);
	public Persona delete(Persona persona);
	public Persona get(String dni);
	public List<Persona> getAll();
}
