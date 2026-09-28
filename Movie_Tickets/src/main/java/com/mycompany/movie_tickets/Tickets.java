/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.movie_tickets;

/**
 *
 * @author trish
 */
public abstract class Tickets implements iTickets {
    private String CustomerName;
    private String MovieTitle;
    private int CustomerAge;
    private double PriceOfMovie;

    public Tickets(String CustomerName, String MovieTitle, int CustomerAge, double PriceOfMovie) {
        this.CustomerName = CustomerName;
        this.MovieTitle = MovieTitle;
        this.CustomerAge = CustomerAge;
        this.PriceOfMovie = PriceOfMovie;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public String getMovieTitle() {
        return MovieTitle;
    }

    public int getCustomerAge() {
        return CustomerAge;
    }

    public double getPriceOfMovie() {
        return PriceOfMovie;
    }
    
    
}
