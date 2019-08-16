package com.sna.rrapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.GenericWebApplicationContext;

import com.sna.rrapi.model.Proceso;

@Service
public class JovenProcesoImpl implements ObjectService<Proceso>{

	@Autowired
	GenericWebApplicationContext context;
	
	@Override
	public Proceso save(Proceso object) {
		return object;
	}

	@Override
	public Proceso update(Proceso object) {
		return object;
	}

	@Override
	public Proceso delete(Proceso object) {
		return object;
	}

	@Override
	public Proceso get(String dni) {
		Proceso proceso = (Proceso) context.getBean("proceso");
		return proceso;
	}

	@Override
	public List<Proceso> getAll() {
		return null;
	}

}
