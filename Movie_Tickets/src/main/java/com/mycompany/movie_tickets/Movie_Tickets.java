
package com.mycompany.movie_tickets;
import java.util.Scanner;

public class Movie_Tickets {

    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

        // Match these prompts EXACTLY to the sample screenshot wording
        System.out.print("Enter Name: ");
        String CustomerName = input.nextLine();
        
         System.out.print("Enter Age: ");
        int CustomerAge= input.nextInt();
        
         System.out.print("Enter Movie Name: ");
        String MovieTitle = input.nextLine();
        input.nextLine();

        System.out.print("Enter Price of movie: ");
        int PriceOfMovie = input.nextInt();

        // Instantiate the SUBCLASS
        TicketSale sale = new TicketSale(CustomerName, MovieTitle, CustomerAge, PriceOfMovie);

        // Call the method that prints the report
        sale.print_tickets();

        input.close();

    }
}
