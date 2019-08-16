package com.sna.rrapi.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.GenericWebApplicationContext;

import com.sna.rrapi.model.Domicilio;

@Service
public class PersonaDomicilioImpl implements ObjectService<Domicilio> {
	
	@Autowired
	GenericWebApplicationContext context;
	
	@Override
	public Domicilio save(Domicilio object) {
		return object;
	}

	@Override
	public Domicilio update(Domicilio object) {
		return object;
	}

	@Override
	public Domicilio delete(Domicilio object) {
		return object;
	}

	@Override
	public Domicilio get(String dni) {
		Domicilio domicilio = (Domicilio) context.getBean("domicilio");
		return domicilio;
	}

	@Override
	public List<Domicilio> getAll() {
		return null;
	}

}
