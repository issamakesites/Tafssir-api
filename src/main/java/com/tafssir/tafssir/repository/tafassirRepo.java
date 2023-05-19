package com.tafssir.tafssir.repository;
import com.tafssir.tafssir.model.tafassir;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface tafassirRepo extends JpaRepository<tafassir, Long>{
	List<tafassir> findByNTafsir(Integer nTafsir);

	List<tafassir> findByAn(Integer An);
}
