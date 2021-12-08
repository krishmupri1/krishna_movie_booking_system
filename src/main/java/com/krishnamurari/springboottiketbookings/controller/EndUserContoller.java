package com.krishnamurari.springboottiketbookings.controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.krishnamurari.springboottiketbookings.ServiceLayer.User;
import com.sun.javaws.exceptions.InvalidArgumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krishnamurari.springboottiketbookings.DAO.BookingsDAO;
import com.krishnamurari.springboottiketbookings.DAO.CityDAO;
import com.krishnamurari.springboottiketbookings.DAO.MovieDAO;
import com.krishnamurari.springboottiketbookings.DAO.ShowDAO;
import com.krishnamurari.springboottiketbookings.DAO.TheaterDAO;
import com.krishnamurari.springboottiketbookings.model.Bookings;
import com.krishnamurari.springboottiketbookings.model.City;
import com.krishnamurari.springboottiketbookings.model.Movie;
import com.krishnamurari.springboottiketbookings.model.Show;
import com.krishnamurari.springboottiketbookings.model.Theater;

@RestController
@RequestMapping("/user")
public class EndUserContoller {

	@Autowired
	CityDAO theCityDAO;
	@Autowired
	User user;
	
	@Autowired
	MovieDAO theMovieDAO;
	
	@Autowired
	TheaterDAO theTheaterDAO;
	
	@Autowired
	ShowDAO theShowDAO;
	
	@Autowired
	BookingsDAO theBookingsDAO;
	
//	Get the list of City where you can book the movie 
	
	@GetMapping("/city")
	public List<City> getAllCity(){
		
		return user.getAllCity();
	}
	
	
//	GEt list of theater Available against a City
	
	@GetMapping("/{ID}/theater")
	public List<Theater> getTheaterInCity(@NotNull @PathVariable(value = "ID") long ID){
		
		City theCity = theCityDAO.findOne(ID);
		
		return theTheaterDAO.gettheaterByCityId(theCity);
	}
	
//	Get Movie available on the theaters
	
	@GetMapping("/theater/{ID}/movie")
	public List<Object[]> getMovieByTheaterID(@NotNull @PathVariable(value = "ID") long ID){
		
		return theMovieDAO.getMovieByTheaterId(ID);
	}

	//show theater and show once a movie is entered


	
//	Get Available Show for a particular movie 
	
	@GetMapping("/movie/{id}/show")
	public List<Show> geShowByMovieId(@NotNull @PathVariable(value ="id") long id){
		
		Movie theMovie = theMovieDAO.findOne(id);
	
		return theShowDAO.fetchByMovie(theMovie);
	}
	
//	Get the seat available for a particular Show using the show ID
	
	@GetMapping("/show/{id}")
	public Bookings getAvailableSeat(@NotNull @PathVariable ( value = "id") long id)throws InvalidArgumentException
	{
		return theBookingsDAO.getAvailableSeat(id);
	}
	
//	Book a Seat using the show id By passing the show POJO to the API 
	
	@PostMapping("show/{id}/bookings")
	public Bookings bookSeatForShow(@PathVariable (value = "id") long id, @Valid @RequestBody Bookings b)
	{
		return theBookingsDAO.bookTheSeat(b);
	}
	
	
	
}






