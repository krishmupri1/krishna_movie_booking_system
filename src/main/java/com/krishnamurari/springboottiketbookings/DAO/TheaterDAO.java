package com.krishnamurari.springboottiketbookings.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishnamurari.springboottiketbookings.model.City;
import com.krishnamurari.springboottiketbookings.model.Theater;
import com.krishnamurari.springboottiketbookings.respository.TheaterRepository;

@Service
public class TheaterDAO {
	
	@Autowired
	TheaterRepository theTheaterRepository;
	
	//Save Theater
	public Theater save(Theater t) {
		return theTheaterRepository.save(t);
	}
	
//	get all theater 
	public List<Theater> getTheater(){
		return theTheaterRepository.findAll();
	}
	
//	get Theater by ID
	
	public Theater findOne(long ID){
		
		return theTheaterRepository.getOne(ID);
		
	}
	
//	Delete theater
	public void deleteTheater(Theater t) {
		theTheaterRepository.delete(t);
	}
	
//	Find theater by city ID
	public List<Theater> gettheaterByCityId(City c){
		return theTheaterRepository.findByCity(c);
	}
	
	
	

}
