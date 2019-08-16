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
import com.sna.rrapi.model.Joven;
import com.sna.rrapi.model.Persona;
import com.sna.rrapi.services.PersonaService;

@RestController
@RequestMapping(path = "/api/joven")
public class JovenRest {
	
	@Autowired
	PersonaService<Joven> jovenService;

	@GetMapping("/")
	private List<Joven> getAll() {
		return jovenService.getAll();
	}

	@GetMapping("/{dni}")
	private Persona getPersona(@PathVariable("dni") String dni) {
		Joven joven = jovenService.get(dni);
		return joven;
	}

	@PostMapping("/")
	private Persona createPersona(@ModelAttribute Joven joven) {
		return joven;
	}

	@PutMapping("/{dni}")
	private Persona updatePersona(@PathVariable("dni") String dni, @ModelAttribute Joven joven) {
		jovenService.update(joven);
		return joven;
	}

	@DeleteMapping("/{dni}")
	private void deletePersona(@PathVariable("dni") String dni) {
		Joven joven = jovenService.get(dni);
		jovenService.delete(joven);
	}

}
