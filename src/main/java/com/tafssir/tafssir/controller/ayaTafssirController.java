package com.tafssir.tafssir.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.tafssir.tafssir.repository.ayaTafssirRepo;
import com.tafssir.tafssir.model.ayaTafssir;

import java.util.List;
import java.util.Optional;



@RestController
@CrossOrigin("*")
@RequestMapping("/aya-tafssir")
public class ayaTafssirController {
	private final ayaTafssirRepo ayaTafssirRepo;

	@Autowired
	public ayaTafssirController(ayaTafssirRepo ayaTafssirRepo) {
		this.ayaTafssirRepo = ayaTafssirRepo;
	}

	@GetMapping
	public ResponseEntity<List<ayaTafssir>> getAllEntities() {
		List<ayaTafssir> entities = ayaTafssirRepo.findAll();
		return ResponseEntity.ok(entities);
	}

	@GetMapping("/{id}")
	public ResponseEntity<ayaTafssir> getEntityById(@PathVariable Long id) {
		Optional<ayaTafssir> optionalEntity = ayaTafssirRepo.findById(id);
		if (optionalEntity.isPresent()) {
			ayaTafssir entity = optionalEntity.get();
			return ResponseEntity.ok(entity);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	@GetMapping("/soura/{soura}")
	public ResponseEntity<List<ayaTafssir>> getEntitiesBySoura(@PathVariable String soura) {
		List<ayaTafssir> entities = ayaTafssirRepo.findBySoura(soura);
		if (!entities.isEmpty()) {
			return ResponseEntity.ok(entities);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
}
