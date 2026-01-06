package com.linkedlist.singlylinkedlist.socialmedia;

public class TestLinkedList {
	 public static void main(String[] args) {
	        SocialMediaLinkedList sm = new SocialMediaLinkedList();

	        sm.addUser(1, "Mohit", 21);
	        sm.addUser(2, "Rohan", 22);
	        sm.addUser(3, "Ravi", 23);
	        sm.addUser(4, "sunny", 21);

	        sm.addFriend(1, 2);
	        sm.addFriend(1, 3);
	        sm.addFriend(2, 3);
	        sm.addFriend(2, 4);
	        sm.addFriend(3, 4);

	        sm.displayFriends(1);
	        sm.displayFriends(2);

	        sm.findMutualFriends(1, 2);

	        sm.searchByUserId(3);
	        sm.searchByName("Tarun");

	        sm.countFriends();

	        sm.removeFriend(1, 3);
	        sm.displayFriends(1);}
}
