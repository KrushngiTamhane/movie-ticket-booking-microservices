package com.movieticket.entity;

import jakarta.persistence.*;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String movieName;

    private String theaterName;

    private String userName;

    private Integer seatsBooked;

    private Double totalAmount;

    public Booking() {
    }

    public Booking(Long id, String movieName,
                   String theaterName,
                   String userName,
                   Integer seatsBooked,
                   Double totalAmount) {
        this.id = id;
        this.movieName = movieName;
        this.theaterName = theaterName;
        this.userName = userName;
        this.seatsBooked = seatsBooked;
        this.totalAmount = totalAmount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getSeatsBooked() {
        return seatsBooked;
    }

    public void setSeatsBooked(Integer seatsBooked) {
        this.seatsBooked = seatsBooked;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }
}