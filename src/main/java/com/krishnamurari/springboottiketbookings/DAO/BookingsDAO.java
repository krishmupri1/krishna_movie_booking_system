package com.krishnamurari.springboottiketbookings.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishnamurari.springboottiketbookings.model.Bookings;
import com.krishnamurari.springboottiketbookings.respository.BookingsRepository;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookingsDAO {

	@Autowired
	BookingsRepository theBookingsRepository;
	
//	Get the available seat for the movie 
	public Bookings getAvailableSeat(long showID) {
		return theBookingsRepository.getOne(showID);
	}
	
//	Book the seat
	@Transactional
	public Bookings bookTheSeat(Bookings book) {
		return theBookingsRepository.save(book);
	}
	
}
