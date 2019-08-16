package com.sna.rrapi.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.GenericWebApplicationContext;
import com.sna.rrapi.model.Escolaridad;

@Service
public class JovenEscolaridadImpl implements ObjectService<Escolaridad>{

	@Autowired
	GenericWebApplicationContext context;
	
	@Override
	public Escolaridad save(Escolaridad object) {
		return object;
	}

	@Override
	public Escolaridad update(Escolaridad object) {
		return object;
	}

	@Override
	public Escolaridad delete(Escolaridad object) {
		return object;
	}

	@Override
	public Escolaridad get(String dni) {
		Escolaridad escolaridad = (Escolaridad) context.getBean("escolaridad");
		return escolaridad;
	}

	@Override
	public List<Escolaridad> getAll() {
		return null;
	}

}
