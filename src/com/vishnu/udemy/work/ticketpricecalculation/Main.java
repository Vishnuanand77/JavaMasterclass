package com.vishnu.udemy.work.ticketpricecalculation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Ticket newTicket = new Ticket(); // Class object

        int no_of_bookings, no_of_tickets;

        // Taking user input
        System.out.println("Enter no of bookings:");
        no_of_bookings = scanner.nextInt(); // Used to run loops over booking process

        System.out.println("Enter the available tickets:");
        Ticket.setAvailableTickets(scanner.nextInt()); // Hard setting the number of available tickets

        for(int i=0; i < no_of_bookings; i++){
            // Ticket ID
            System.out.println("Enter the ticketId:");
            int ticket_id = scanner.nextInt();
            newTicket.setTicketid(ticket_id);
            // Ticket Price
            System.out.println("Enter the price:");
            int price = scanner.nextInt();
            newTicket.setPrice(price);
            // Number of tickets
            System.out.println("Enter the no of tickets:");
            no_of_tickets = scanner.nextInt();
            // Printing currently available tickets
            System.out.println("Available tickets: " + Ticket.getAvailableTickets());
            // Calculating ticket price
            int ticket_cost = newTicket.calculateTicketCost(no_of_tickets);
            System.out.println("Total amount: " + ticket_cost);
            // Printing available tickets again
            System.out.println("Available ticket after booking: " + Ticket.getAvailableTickets());
        }
    }
}
