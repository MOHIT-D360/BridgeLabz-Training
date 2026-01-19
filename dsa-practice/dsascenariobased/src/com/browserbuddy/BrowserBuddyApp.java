package com.browserbuddy;

public class BrowserBuddyApp {
	public static void main(String[] args) {
		BrowerTab tab = new BrowerTab();
		
		tab.visit("Google.com");
		tab.visit("awwwwwards.com");
		tab.visit("github.com");
		
		tab.back();
		tab.forward();
		
		tab.closeTab();
		tab.restoreTab();
	}
}
