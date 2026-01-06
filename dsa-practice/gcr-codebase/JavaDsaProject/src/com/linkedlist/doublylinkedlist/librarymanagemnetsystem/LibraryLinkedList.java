package com.linkedlist.doublylinkedlist.librarymanagemnetsystem;


public class LibraryLinkedList {
    private BookNode head;
    private BookNode tail;

    public LibraryLinkedList() {
        head = null;
        tail = null;
    }

    public void addAtBeginning(int bookId, String title, String author, String genre, boolean isAvailable) {
        BookNode newNode = new BookNode(bookId, title, author, genre, isAvailable);
        
        if(head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addAtEnd(int bookId, String title, String author, String genre, boolean isAvailable) {
        BookNode newNode = new BookNode(bookId, title, author, genre, isAvailable);
        
        if(tail == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void addAtPosition(int position, int bookId, String title, String author, String genre, boolean isAvailable) {
        if(position <= 1) {
            addAtBeginning(bookId, title, author, genre, isAvailable);
            return;
        }
        
        BookNode temp = head;
        int count = 1;

        while(temp != null && count < position - 1) {
            temp = temp.next;
            count++;
        }

        if(temp == null || temp.next == null) {
            addAtEnd(bookId, title, author, genre, isAvailable);
            return;
        }
        BookNode newNode = new BookNode(bookId, title, author, genre, isAvailable);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    public void removeByBookId(int bookId) {
        if(head == null) return;
        
        if(head.bookId == bookId) {
            head = head.next;
            if(head != null) head.prev = null;
            else tail = null;
            return;
        }
        
        BookNode temp = head;
        while(temp != null && temp.bookId != bookId) {
            temp = temp.next;
        }
        
        if(temp == null) return;
        
        if(temp == tail) {
            tail = tail.prev;
            tail.next = null;
            return;
        }
        
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }

    public void searchByTitle(String title) {
        BookNode temp = head;
        
        while(temp != null) {
            if(temp.title.equals(title)) {
                System.out.println(temp.bookId + " " + temp.title + " " + temp.author + " " + temp.genre + " " + temp.isAvailable);
                return;
            }
            temp = temp.next;
        }
        System.out.println("not found");
    }

    public void searchByAuthor(String author) {
        BookNode temp = head;
        
        while(temp != null) {
            if(temp.author.equals(author)) {
                System.out.println(temp.bookId + " " + temp.title + " " + temp.author + " " + temp.genre + " " + temp.isAvailable);
            }
            temp = temp.next;
        }
    }

    public void updateAvailability(int bookId, boolean status) {
        BookNode temp = head;
        
        while(temp != null) {
            if(temp.bookId == bookId) {
                temp.isAvailable = status;
                return;
            }
            temp = temp.next;
        }
    }

    public void displayForward() {
        BookNode temp = head;
        
        while(temp != null) {
            System.out.println(temp.bookId + " " + temp.title + " " + temp.author + " " + temp.genre + " " + temp.isAvailable);
            temp = temp.next;
        }
    }

    public void displayReverse() {
        BookNode temp = tail;
        
        while(temp != null) {
            System.out.println(temp.bookId + " " + temp.title + " " + temp.author + " " + temp.genre + " " + temp.isAvailable);
            temp = temp.prev;
        }
    }

    public void countBooks() {
        int count = 0;
        BookNode temp = head;
        
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        
        System.out.println("Total Books : " + count);
    }

    
}