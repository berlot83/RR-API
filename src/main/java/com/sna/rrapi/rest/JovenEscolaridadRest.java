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
import com.sna.rrapi.model.Escolaridad;
import com.sna.rrapi.services.ObjectService;

@RestController
@RequestMapping(path = "/api/escolaridad")
public class JovenEscolaridadRest {
	
	@Autowired
	ObjectService<Escolaridad> objectService;
	
	@GetMapping("/")
	private List<Escolaridad> getAll() {
		return objectService.getAll();
	}

	@GetMapping("/{dni}")
	private Escolaridad getEscolaridad(@PathVariable("dni") String dni) {
		Escolaridad escolaridad = objectService.get(dni);
		return escolaridad;
	}

	@PostMapping("/")
	private Escolaridad createEscolaridad(@ModelAttribute Escolaridad escolaridad) {
		return escolaridad;
	}

	@PutMapping("/{dni}")
	private Escolaridad updateEscolaridad(@PathVariable("dni") String dni, @ModelAttribute Escolaridad escolaridad) {
		objectService.update(escolaridad);
		return escolaridad;
	}

	@DeleteMapping("/{dni}")
	private void deleteEscolaridad(@PathVariable("dni") String dni) {
		Escolaridad escolaridad = objectService.get(dni);
		objectService.delete(escolaridad);
	}

}
