package com.regex;

import java.util.regex.*;

public class FindReaptingWords {
    public static void main(String[] args) {
        String text = "Apple  is good company and Apple is tasty fruit fruit .";
        Pattern pattern = Pattern.compile("\\b(\\w+)\\s+\\1\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}