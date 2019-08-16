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
import com.sna.rrapi.model.Domicilio;
import com.sna.rrapi.services.ObjectService;

@RestController
@RequestMapping(path = "/api/domicilio")
public class PersonaDomicilioRest {

	@Autowired
	ObjectService<Domicilio> objectService;

	@GetMapping("/")
	private List<Domicilio> getAll() {
		return objectService.getAll();
	}

	@GetMapping("/{dni}")
	private Domicilio getDomicilio(@PathVariable("dni") String dni) {
		Domicilio domicilio = objectService.get(dni);
		return domicilio;
	}

	@PostMapping("/")
	private Domicilio createDomicilio(@ModelAttribute Domicilio domicilio) {
		return domicilio;
	}

	@PutMapping("/{dni}")
	private Domicilio updateDomicilio(@PathVariable("dni") String dni, @ModelAttribute Domicilio domicilio) {
		objectService.update(domicilio);
		return domicilio;
	}

	@DeleteMapping("/{dni}")
	private void deleteDomicilio(@PathVariable("dni") String dni) {
		Domicilio domicilio = objectService.get(dni);
		objectService.delete(domicilio);
	}

}
