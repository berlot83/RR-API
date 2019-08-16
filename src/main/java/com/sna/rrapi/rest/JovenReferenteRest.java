package com.sna.rrapi.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sna.rrapi.model.Persona;
import com.sna.rrapi.model.Referente;
import com.sna.rrapi.services.PersonaService;

@RestController
@RequestMapping(path = "/api/referente")
public class JovenReferenteRest {

	@Autowired
	PersonaService<Referente> personaService;

	@GetMapping("/")
	private List<Referente> getAll() {
		return personaService.getAll();
	}

	@GetMapping("/{dni}")
	private Persona getPersona(@PathVariable("dni") String dni) {
		Referente joven = personaService.get(dni);
		return joven;
	}

	@PostMapping("/")
	private Persona createPersona(@ModelAttribute Referente referente) {
		return referente;
	}

	@PutMapping("/{dni}")
	private Persona updatePersona(@PathVariable("dni") String dni, @ModelAttribute Referente referente) {
		personaService.update(referente);
		return referente;
	}

	@DeleteMapping("/{dni}")
	private void deletePersona(@PathVariable("dni") String dni) {
		Referente referente = personaService.get(dni);
		personaService.delete(referente);
	}
}
