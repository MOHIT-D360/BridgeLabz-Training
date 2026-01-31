package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDates {
	public static void main(String[] args) {
		String text = "The events are scheduled for 13/06/2024, 16/07/2028, and 22/02/2021.";
        Pattern pattern = Pattern.compile("\\b[0-9]{2}/[0-9]{2}/[0-9]{4}\\b");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
	}
}