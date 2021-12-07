package com.krishnamurari.springboottiketbookings.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.krishnamurari.springboottiketbookings.model.City;
import com.krishnamurari.springboottiketbookings.model.Theater;

public interface TheaterRepository extends JpaRepository<Theater, Long> {

	public List<Theater> findByCity(City ID);
}
