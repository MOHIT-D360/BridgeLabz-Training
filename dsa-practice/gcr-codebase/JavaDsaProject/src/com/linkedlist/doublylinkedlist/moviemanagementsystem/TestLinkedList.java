package com.linkedlist.doublylinkedlist.moviemanagementsystem;

public class TestLinkedList {
	public static void main(String[] args) {
        MovieDoublyLinkedList list = new MovieDoublyLinkedList();

        list.addAtBeginning("temp movie 1", "Director 1", 2010, 9.0);
        list.addAtEnd("Movie 2", "Director 2", 2015, 8.0);
        list.addAtPosition(2, "Movie 3", "Director 3", 2020, 7);

        list.displayForward();

        list.displayReverse();

        list.searchByDirector("Director 3");

        list.updateRating("Moive 3", 9.5);

        list.removeByTitle("Movie 3");

        list.displayForward();
    }
}
