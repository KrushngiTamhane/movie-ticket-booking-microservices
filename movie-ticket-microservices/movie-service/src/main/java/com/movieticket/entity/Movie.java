package com.movieticket.entity;

import jakarta.persistence.*;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String movieName;

    private String language;

    private String genre;

    private Double ticketPrice;

    public Movie() {
    }

    public Movie(Long id, String movieName, String language,
                 String genre, Double ticketPrice) {
        this.id = id;
        this.movieName = movieName;
        this.language = language;
        this.genre = genre;
        this.ticketPrice = ticketPrice;
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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}