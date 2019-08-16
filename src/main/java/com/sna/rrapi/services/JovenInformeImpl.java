package com.sna.rrapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.GenericWebApplicationContext;
import com.sna.rrapi.model.Informe;

@Service
public class JovenInformeImpl implements ObjectService<Informe>{

	@Autowired
	GenericWebApplicationContext context;
	
	@Override
	public Informe save(Informe object) {
		return object;
	}

	@Override
	public Informe update(Informe object) {
		return object;
	}

	@Override
	public Informe delete(Informe object) {
		return object;
	}

	@Override
	public Informe get(String dni) {
		Informe informe = (Informe) context.getBean("informe");
		return informe;
	}

	@Override
	public List<Informe> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
