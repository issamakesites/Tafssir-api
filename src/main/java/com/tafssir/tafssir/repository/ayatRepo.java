package com.tafssir.tafssir.repository;
import com.tafssir.tafssir.model.ayat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ayatRepo extends JpaRepository<ayat, Long>{

	List<ayat> findByNSoura(Integer nsoura);
}
