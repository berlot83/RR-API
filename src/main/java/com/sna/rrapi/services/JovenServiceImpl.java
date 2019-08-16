package com.sna.rrapi.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.GenericWebApplicationContext;
import com.sna.rrapi.model.Joven;

@Service
public class JovenServiceImpl implements PersonaService<Joven>{

	@Autowired
	GenericWebApplicationContext context;
	
	@Override
	public Joven save(Joven persona) {
		/* Código del JPA Repository */
		return persona;
	}

	@Override
	public Joven update(Joven persona) {
		/* Código del JPA Repository */
		return persona;
	}

	@Override
	public Joven delete(Joven persona) {
		/* Código del JPA Repository */
		return persona;
	}

	@Override
	public Joven get(String dni) {
		/* Código del JPA Repository */
		Joven joven = (Joven) context.getBean("joven");
		System.out.println(joven.getApellido());
		return joven;
	}

	@Override
	public List<Joven> getAll() {
		return null;
	}

}
