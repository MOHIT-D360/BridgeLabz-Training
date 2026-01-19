package com.browserbuddy;

public class Tabs {
 String url;
 Tabs prev;
 Tabs next;
  
 Tabs(String url){
	this.url = url;
	this.prev = null;
	this.next = null;
	
 }
 
}
