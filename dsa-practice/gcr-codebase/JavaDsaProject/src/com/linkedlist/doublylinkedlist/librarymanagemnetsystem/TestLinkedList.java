package com.linkedlist.doublylinkedlist.librarymanagemnetsystem;

public class TestLinkedList {
	public static void main(String[] args) {
        LibraryLinkedList library = new LibraryLinkedList();

        library.addAtBeginning(1, "wings of fire", "apj abdul kamal", "biography", true);
        library.addAtEnd(2, "Book 2", "Author 2", "horror", true);
        library.addAtPosition(2, 4, "OOPS", "John", "Programming", true);

        library.displayForward();

        library.displayReverse();

        library.searchByTitle("Book 1");
        library.searchByAuthor("Author 2");

        library.updateAvailability(3, true);

        library.removeByBookId(1);

        library.displayForward();

        library.countBooks();
    }
}
