
package com.tafssir.tafssir.repository;
		import com.tafssir.tafssir.model.ayaTafssir;
		import org.springframework.data.jpa.repository.JpaRepository;

		import java.util.List;

public interface ayaTafssirRepo extends JpaRepository<ayaTafssir, Long> {
	List<ayaTafssir> findBySoura(String soura);
}
