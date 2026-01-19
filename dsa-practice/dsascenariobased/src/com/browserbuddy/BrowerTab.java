package com.browserbuddy;
import java.util.Stack;

public class BrowerTab {
	Tabs current;
	Stack<Tabs> closedTabs = new Stack<>();
	
	void visit(String url) {
		Tabs newTab = new Tabs(url);
		if(current != null) {
			current.next = newTab;
			newTab.prev = current;
		}
		current = newTab;
		System.out.println("Visited :"+ url);
	}
	
	void back() {
		if(current != null && current.prev != null) {
			current = current.prev;
			System.out.println("Back to :"+ current.url);
		}
		else {
			System.out.println("No previous page");
		}
	}
	void forward() {
		if(current != null && current.next != null) {
			current = current.next;
			System.out.println("Forward to: " + current.url);
		}
		else {
			System.out.println("No next page");
		}
	}
	void closeTab() {
		if(current !=null) {
			closedTabs.push(current);
			System.out.println("Tab closed :"+ current.url);
			current = current.prev;
		}
	}
	void restoreTab() {
		if(closedTabs.isEmpty()) return;
		
		Tabs restored = closedTabs.pop();
		
		if(current != null) {
			restored.prev = current;
			restored.next = current.next;
			
			if(current.next != null) {
				current.next.prev = restored;
			}
			current.next = restored;
		}
		current = restored;
		System.out.println("Restored tab :"+current.url);
	}
}
