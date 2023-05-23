package com.tafssir.tafssir.service;

import com.tafssir.tafssir.model.tafssir;
import com.tafssir.tafssir.repository.tafssirRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class tafssirService {
	private tafssirRepo tafssirRepo;

	@Autowired
	public tafssirService(tafssirRepo tafssirRepo) {
		this.tafssirRepo = tafssirRepo;
	}

	public List<tafssir> getAllEntities(String tableName) {
		return tafssirRepo.findAllByTableName(tableName);
	}

	public Optional<tafssir> getEntityById(Long id, String tableName) {
		return tafssirRepo.findByIdAndTableName(id, tableName);
	}

	public tafssir createEntity(tafssir entity, String tableName) {
		entity.setTableName(tableName);
		return tafssirRepo.save(entity);
	}
}
