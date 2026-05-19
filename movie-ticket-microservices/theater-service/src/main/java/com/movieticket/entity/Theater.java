package com.movieticket.entity;

import jakarta.persistence.*;

@Entity
public class Theater {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String theaterName;

    private String city;

    private Integer totalSeats;

    public Theater() {
    }

    public Theater(Long id, String theaterName,
                   String city, Integer totalSeats) {
        this.id = id;
        this.theaterName = theaterName;
        this.city = city;
        this.totalSeats = totalSeats;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(Integer totalSeats) {
        this.totalSeats = totalSeats;
    }
}