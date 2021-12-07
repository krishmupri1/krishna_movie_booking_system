package com.krishnamurari.springboottiketbookings.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.krishnamurari.springboottiketbookings.model.Movie;
import com.krishnamurari.springboottiketbookings.model.Show;

@Repository
public interface ShowRepository extends JpaRepository<Show, Long> {
	//@Query(value="SELECT M_name,T_name from table_movie Inner Join table_theater")
	public List<Show> findBytheMovie(Movie m);
}
