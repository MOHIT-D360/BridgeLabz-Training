package com.constructor.level1;

public class LibraryBook {

    private String title;
    private String author;
    private double price;
    private boolean availability;

    // Constructor
    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true; 
    }

    // Borrow book
    public void bookBorrow() {
        if (!availability) {
            System.out.println("This book is already borrowed");
        } else {
            availability = false;
            System.out.println("Book successfully borrowed");
            
            
        }
    }

    // Return book
    public void bookReturn() {
        if (availability) {
            System.out.println("Book was not borrowed");
        } else {
            availability = true;
            System.out.println("Book returned successfully");
            
            
        }
    }

    // Display details
    public void display() {
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
        System.out.println("Available : " + availability);
    }

    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook("Wings of fire", "APj Abdul Kalam", 550.99);

        b1.bookBorrow();
        b1.bookBorrow(); 
        b1.bookReturn();
        b1.display();
    }
}
