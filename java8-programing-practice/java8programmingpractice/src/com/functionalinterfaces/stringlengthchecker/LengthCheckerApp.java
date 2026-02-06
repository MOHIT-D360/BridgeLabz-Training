package com.functionalinterfaces.stringlengthchecker;
import java.util.function.*;
public class LengthCheckerApp {
	public static void main(String[] args) {
		String msg = "hello there this is mohit a great coder and nice engineer";
		int limit = 20;
		Function<String,Integer> fn = x -> x.length();
		
		int length = fn.apply(msg);
		
		if(length>limit ) {
			System.out.println("Message too long ");
		}
		else {
			System.out.println("Your message :"+msg);
		}
	}
}
