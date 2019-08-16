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
import com.sna.rrapi.model.Proceso;
import com.sna.rrapi.services.ObjectService;

@RestController
@RequestMapping(path = "/api/proceso")
public class JovenProcesoRest {
	@Autowired
	ObjectService<Proceso> objectService;

	@GetMapping("/")
	private List<Proceso> getAll() {
		return objectService.getAll();
	}

	@GetMapping("/{dni}")
	private Proceso getProceso(@PathVariable("dni") String dni) {
		Proceso proceso = objectService.get(dni);
		return proceso;
	}

	@PostMapping("/")
	private Proceso createProceso(@ModelAttribute Proceso proceso) {
		return proceso;
	}

	@PutMapping("/{dni}")
	private Proceso updateProceso(@PathVariable("dni") String dni, @ModelAttribute Proceso proceso) {
		objectService.update(proceso);
		return proceso;
	}

	@DeleteMapping("/{dni}")
	private void deleteInforme(@PathVariable("dni") String dni) {
		Proceso proceso = objectService.get(dni);
		objectService.delete(proceso);
	}
	
}
