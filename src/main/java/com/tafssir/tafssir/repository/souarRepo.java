package com.tafssir.tafssir.repository;
import com.tafssir.tafssir.model.souar;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface souarRepo extends JpaRepository<souar, Long> {
	List<souar> findByNSoura(Integer nsoura);

	List<souar> findByNom(String Nom);

	List<souar> findByMakkiMadani(String MakkiMadani);
}
