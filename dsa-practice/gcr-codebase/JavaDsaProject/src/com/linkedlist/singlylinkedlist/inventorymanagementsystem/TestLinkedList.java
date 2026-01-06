package com.linkedlist.singlylinkedlist.inventorymanagementsystem;

public class TestLinkedList {
	public static void main(String[] args) {
        InventoryLinkedList inventory = new InventoryLinkedList();

        inventory.addAtBeginning(1, "Item 1", 50, 100);
        inventory.addAtEnd(2, "Item 2", 2, 500);
        inventory.addAtEnd(3, "Item 3", 10, 50);
        inventory.addAtPosition(2, 4, "Item 4", 300, 5);

        inventory.displayItems();

        inventory.updateQuantity(3, 150);

        inventory.searchByItemId(2);
        inventory.searchByItemName("Pen");

        inventory.calculateTotalValue();

        inventory.sortByItemName();
        inventory.displayItems();

        inventory.sortByPrice();
        inventory.displayItems();

        inventory.removeByItemId(1);
        inventory.displayItems();
    }
}
