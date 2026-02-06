package com.streamsapi;

import java.util.Arrays;
import java.util.List;

public class EmailNotificationApp {
	public static void main(String[] args) {
		List<String> emails = Arrays.asList(
			"user1@gmail.com",
				"user2@gmail.com",	
				"user3@gmail.com",	
				"user4@gmail.com"	
				);
		
		emails.forEach(x->sendEmail(x));
	}
	static void sendEmail(String email) {
		System.out.println("Sending notification email to :"+email);
	}
}
