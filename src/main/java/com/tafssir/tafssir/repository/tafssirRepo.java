package com.tafssir.tafssir.repository;

import com.tafssir.tafssir.model.tafssir;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface tafssirRepo extends JpaRepository<tafssir, Long> {
	List<tafssir> findAllByTableName(String tableName);
	Optional<tafssir> findByIdAndTableName(Long id, String tableName);
	void deleteByIdAndTableName(Long id, String tableName);

	tafssir save(tafssir oldEntity);
}
