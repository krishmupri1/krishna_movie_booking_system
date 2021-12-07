package com.krishnamurari.springboottiketbookings.DAO;

import java.util.List;

import com.krishnamurari.springboottiketbookings.respository.MovieRepository;
import com.krishnamurari.springboottiketbookings.respository.TheaterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishnamurari.springboottiketbookings.model.Movie;
import com.krishnamurari.springboottiketbookings.model.Show;
import com.krishnamurari.springboottiketbookings.respository.ShowRepository;

@Service
public class ShowDAO {

	@Autowired
	ShowRepository theShowRepository;

	@Autowired
	MovieRepository movieRepository;

	@Autowired
	TheaterRepository theaterRepository;
	
//	Save the show
	public Show save(Show show)
	{
		return theShowRepository.save(show);
	}
	
//	Fetch all show 
	public List<Show> fetchAllShow(){
		return theShowRepository.findAll();
		
	}
	//fetch show by movieName


//	Fetch show by ID
	public Show fetchById(long Id) {
		return theShowRepository.getOne(Id);
	}
	
//	Fetch show by Moive ID
	
	public List<Show> fetchByMovie(Movie m){
		return theShowRepository.findBytheMovie(m);
	}
}
