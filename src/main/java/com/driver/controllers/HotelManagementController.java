package com.driver.controllers;

import com.driver.model.Booking;
import com.driver.model.Facility;
import com.driver.model.Hotel;
import com.driver.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@RestController
@RequestMapping("/hotel")
public class HotelManagementController {


    HotelManagementService hotelManagementService = new HotelManagementService();

    @PostMapping("/add-hotel")
    public String addHotel(@RequestBody Hotel hotel){


        return hotelManagementService.addHotel(hotel);
    }

    @PostMapping("/add-user")
    public Integer addUser(@RequestBody User user){



        return hotelManagementService.addUser(user);
    }

    @GetMapping("/get-hotel-with-most-facilities")
    public String getHotelWithMostFacilities(){



        return hotelManagementService.getHotelWithMostFacilities();
    }

    @PostMapping("/book-a-room")
    public int bookARoom(@RequestBody Booking booking){


        return hotelManagementService.bookARoom(booking);
    }

    @GetMapping("/get-bookings-by-a-person/{aadharCard}")
    public int getBookings(@PathVariable("aadharCard")Integer aadharCard)
    {
        //In this function return the bookings done by a person
        return hotelManagementService.getBookings(aadharCard);
    }

    @PutMapping("/update-facilities")
    public Hotel updateFacilities(List<Facility> newFacilities,String hotelName){


        return hotelManagementService.updateFacilities(newFacilities, hotelName);
    }

}
