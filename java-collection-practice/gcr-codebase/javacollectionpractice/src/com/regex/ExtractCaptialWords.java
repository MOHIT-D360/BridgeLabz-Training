package com.regex;
import java.util.regex.*;

public class ExtractCaptialWords {
	public static void main(String[] args) {
		String text = "India has seven wonders Taj mahal is one of them situated in Agra.";
	    Pattern pattern = Pattern.compile("\\b[A-Z][a-z]*\\b");
	    Matcher matcher = pattern.matcher(text);

	    while (matcher.find()) {
	    	System.out.println(matcher.group());
	    }
	}
}
