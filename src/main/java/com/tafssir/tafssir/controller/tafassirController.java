package com.tafssir.tafssir.controller;

import com.tafssir.tafssir.model.tafassir;
import com.tafssir.tafssir.repository.tafassirRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/tafassir")
public class tafassirController {

	private final tafassirRepo tafassirRepo;

	@Autowired
		public tafassirController(tafassirRepo tafassirRepo) {
			this.tafassirRepo = tafassirRepo;
		}
	@GetMapping("/{NTafsir}")
	public ResponseEntity<List<tafassir>> getEntitiesByNTafsir(@PathVariable Integer NTafsir) {
		List<tafassir> entities = tafassirRepo.findByNTafsir(NTafsir);
		if (!entities.isEmpty()) {
			return ResponseEntity.ok(entities);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	@GetMapping("/an/{An}")
	public ResponseEntity<List<tafassir>> getEntitiesByAn(@PathVariable Integer An) {
		List<tafassir> entities = tafassirRepo.findByAn(An);
		if (!entities.isEmpty()) {
			return ResponseEntity.ok(entities);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	@GetMapping
	public ResponseEntity<List<tafassir>> getAllEntities() {
		List<tafassir> entities = tafassirRepo.findAll();
		if (!entities.isEmpty()) {
			return ResponseEntity.ok(entities);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

}
