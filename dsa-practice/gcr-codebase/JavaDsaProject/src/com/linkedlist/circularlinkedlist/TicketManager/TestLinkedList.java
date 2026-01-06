package com.linkedlist.circularlinkedlist.TicketManager;

public class TestLinkedList {
	public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();

        system.addTicket(1, "Aman", "Movie 1", "1", "1");
        system.addTicket(2, "Tarun", "Movie 1", "2", "2");
        system.addTicket(3, "Ravi", "Movie 2", "1", "3");

        system.displayTickets();

        system.searchByCustomerName("Aman");

        system.searchByMovieName("Movie 2");

        system.countTickets();

        system.removeTicket(2);

        system.displayTickets();

        system.countTickets();
    }
}
