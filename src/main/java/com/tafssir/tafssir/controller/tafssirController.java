package com.tafssir.tafssir.controller;

import com.tafssir.tafssir.model.tafssir;
import com.tafssir.tafssir.repository.tafssirRepo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.tafssir.tafssir.service.tafssirService;
import java.util.List;
import java.util.Optional;
@RestController
@CrossOrigin("*")
@RequestMapping("/entities/{tableName}")
public class tafssirController {

	private final tafssirService tafssirService;

	public tafssirController(tafssirService tafssirService) {
		this.tafssirService = tafssirService;
	}

	@GetMapping
	public List<tafssir> getAllEntities(@PathVariable String tableName) {
		return tafssirService.getAllEntities(tableName);
	}

	@GetMapping("/{id}")
	public ResponseEntity<tafssir> getEntityById(@PathVariable Long id, @PathVariable String tableName) {
		Optional<tafssir> entity = tafssirService.getEntityById(id, tableName);
		return entity.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}
}
