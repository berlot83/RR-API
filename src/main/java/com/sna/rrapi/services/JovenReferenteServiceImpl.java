package com.sna.rrapi.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.GenericWebApplicationContext;
import com.sna.rrapi.model.Referente;

@Service
public class JovenReferenteServiceImpl implements PersonaService<Referente>{

	@Autowired
	GenericWebApplicationContext context;
	
	@Override
	public Referente save(Referente persona) {
		return persona;
	}

	@Override
	public Referente update(Referente persona) {
		return persona;
	}

	@Override
	public Referente delete(Referente persona) {
		return persona;
	}

	@Override
	public Referente get(String dni) {
		Referente referente = (Referente) context.getBean("referente1");
		return referente;
	}

	@Override
	public List<Referente> getAll() {
		List<Referente> referente = (List<Referente>) context.getBean("referentes");
		return referente;
	}


}
