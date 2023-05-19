package com.tafssir.tafssir.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.tafssir.tafssir.repository.ayatRepo;
import com.tafssir.tafssir.model.ayat;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/ayat")
public class ayatController {
	private final ayatRepo ayatRepo;

	@Autowired
	public ayatController(ayatRepo ayatRepo) {
		this.ayatRepo = ayatRepo;
	}

	@GetMapping
	public ResponseEntity<List<ayat>> getAllEntities() {
		List<ayat> entities = ayatRepo.findAll();
		return ResponseEntity.ok(entities);
	}

	@GetMapping("/{id}")
	public ResponseEntity<ayat> getEntityById(@PathVariable Long id) {
		Optional<ayat> optionalEntity = ayatRepo.findById(id);
		if (optionalEntity.isPresent()) {
			ayat entity = optionalEntity.get();
			return ResponseEntity.ok(entity);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	@GetMapping("/nsoura/{nsoura}")
	public ResponseEntity<List<ayat>> getEntitiesByNSoura(@PathVariable Integer nsoura) {
		List<ayat> entities = ayatRepo.findByNSoura(nsoura);
		if (!entities.isEmpty()) {
			return ResponseEntity.ok(entities);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}
