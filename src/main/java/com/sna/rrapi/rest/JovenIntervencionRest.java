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
import com.sna.rrapi.model.Intervencion;
import com.sna.rrapi.services.ObjectService;

@RestController
@RequestMapping(path = "/api/intervencion")
public class JovenIntervencionRest {
	
	@Autowired
	ObjectService<Intervencion> objectService;
	
	@GetMapping("/")
	private List<Intervencion> getAll() {
		return objectService.getAll();
	}

	@GetMapping("/{dni}")
	private Intervencion getIntervencion(@PathVariable("dni") String dni) {
		Intervencion intervencion = objectService.get(dni);
		return intervencion;
	}

	@PostMapping("/")
	private Intervencion createIntervencion(@ModelAttribute Intervencion intervencion) {
		return intervencion;
	}

	@PutMapping("/{dni}")
	private Intervencion updateIntervencion(@PathVariable("dni") String dni, @ModelAttribute Intervencion intervencion) {
		objectService.update(intervencion);
		return intervencion;
	}

	@DeleteMapping("/{dni}")
	private void deleteIntervencion(@PathVariable("dni") String dni) {
		Intervencion intervencion = objectService.get(dni);
		objectService.delete(intervencion);
	}

}
