
package com.mycompany.movie_tickets;


public class TicketSale extends Tickets {

    public TicketSale(String CustomerName, String MovieTitle, int CustomerAge, double PriceOfMovie) {
        super(CustomerName, MovieTitle, CustomerAge, PriceOfMovie);
    }

    @Override
    public void print_tickets() {
        double result = getCustomerAge();
        if (getCustomerAge() >= 65) {
            result = result * 0.1; // placeholder discount example
        }else{ 
            System.out.println("No Disscount");
        }
       // ---- PRINT THE REPORT - match sample wording/format exactly ----
        System.out.println("*".repeat(35));
        System.out.println("Customer Name: " + getCustomerName());
        System.out.println("Customer Age: " + getCustomerAge());
        System.out.println("Movie Name: " + getMovieTitle());
        System.out.println("Price of Movie: " + result);
        System.out.println("*".repeat(35));
    }    
        
        
    }
    

