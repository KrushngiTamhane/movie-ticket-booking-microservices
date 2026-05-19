package com.movieticket.booking.controller;


import com.movieticket.entity.Booking;
import com.movieticket.repository.BookingRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/bookings")
@CrossOrigin(origins = "http://localhost:4200")
public class BookingController {

    private final BookingRepository bookingRepository;

    public BookingController(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @GetMapping
    public List<Booking> getBookings() {
        return bookingRepository.findAll();
    }

    @PostMapping
    public Booking addBooking(@RequestBody Booking booking) {
        return bookingRepository.save(booking);
    }
}