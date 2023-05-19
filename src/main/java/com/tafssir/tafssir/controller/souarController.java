package com.tafssir.tafssir.controller;

import com.tafssir.tafssir.model.ayat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.tafssir.tafssir.repository.souarRepo;
import com.tafssir.tafssir.model.souar;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/souar")
public class souarController {

	private final souarRepo souarRepo;

	@Autowired
	public souarController(souarRepo souarRepo) {
		this.souarRepo = souarRepo;
	}

	@GetMapping("/nsoura/{nsoura}")
	public ResponseEntity<List<souar>> getEntitiesByNSoura(@PathVariable Integer nsoura) {
		List<souar> entities = souarRepo.findByNSoura(nsoura);
		if (!entities.isEmpty()) {
			return ResponseEntity.ok(entities);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@GetMapping("/nom/{nom}")
	public ResponseEntity<List<souar>> getEntitiesByNom(@PathVariable String Nom) {
		List<souar> entities = souarRepo.findByNom(Nom);
		if (!entities.isEmpty()) {
			return ResponseEntity.ok(entities);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@GetMapping("/makki-madani/{MakkiMadani}")
	public ResponseEntity<List<souar>> getEntitiesByMakkiMadani(@PathVariable String MakkiMadani) {
		List<souar> entities = souarRepo.findByMakkiMadani(MakkiMadani);
		if (!entities.isEmpty()) {
			return ResponseEntity.ok(entities);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	@GetMapping
	public ResponseEntity<List<souar>> getAllEntities() {
		List<souar> entities = souarRepo.findAll();
		return ResponseEntity.ok(entities);
	}
}
