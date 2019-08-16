package com.sna.rrapi.services;

import java.time.LocalDate;
import java.util.List;
import org.springframework.stereotype.Service;
import com.sna.rrapi.model.Joven;

@Service
public class JovenServiceImpl implements PersonaService<Joven>{

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
		Joven p = new Joven();
		p.setDni(dni);
		p.setNacimiento(LocalDate.of(1983, 4, 9));
		p.setNombre("Axel get");
		p.setApellido("Berlot");
		return p;
	}

	@Override
	public List<Joven> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
