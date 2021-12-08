package com.krishnamurari.springboottiketbookings.ServiceLayer;
import com.krishnamurari.springboottiketbookings.DAO.CityDAO;
import com.krishnamurari.springboottiketbookings.Exception.NotFoundException;
import com.krishnamurari.springboottiketbookings.controller.EndUserContoller;
import com.krishnamurari.springboottiketbookings.controller.TicketBookingController;
import com.krishnamurari.springboottiketbookings.model.City;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Objects;



public class Admin{

    @Autowired
    TicketBookingController ticketBookingController;
    @Autowired
    CityDAO theCityDAO;

    public List<City> getAllCity(){
        List<City>cityList=theCityDAO.getCity();
        if(Objects.isNull(cityList)){
            throw new NotFoundException("City not found in database",1001);
        }
        return cityList;
    }
    public String printHello(){
        return "Hello World";
    }

}


