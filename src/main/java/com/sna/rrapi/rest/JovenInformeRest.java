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
import com.sna.rrapi.model.Informe;
import com.sna.rrapi.services.ObjectService;

@RestController
@RequestMapping(path = "/api/informe")
public class JovenInformeRest {
	
	@Autowired
	ObjectService<Informe> objectService;

	@GetMapping("/")
	private List<Informe> getAll() {
		return objectService.getAll();
	}

	@GetMapping("/{dni}")
	private Informe getInforme(@PathVariable("dni") String dni) {
		Informe informe = objectService.get(dni);
		return informe;
	}

	@PostMapping("/")
	private Informe createInforme(@ModelAttribute Informe informe) {
		return informe;
	}

	@PutMapping("/{dni}")
	private Informe updateInforme(@PathVariable("dni") String dni, @ModelAttribute Informe informe) {
		objectService.update(informe);
		return informe;
	}

	@DeleteMapping("/{dni}")
	private void deleteInforme(@PathVariable("dni") String dni) {
		Informe informe = objectService.get(dni);
		objectService.delete(informe);
	}

}
