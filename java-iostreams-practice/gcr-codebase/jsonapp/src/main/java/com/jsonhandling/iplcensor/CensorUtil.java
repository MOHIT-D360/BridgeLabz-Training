package com.jsonhandling.iplcensor;

public class CensorUtil {
	public static String maskTeam(String teamName) {
		if(teamName == null || teamName.isEmpty()) return teamName;
		String firstWord = teamName.split(" ")[0];
		return firstWord+ " ***";
	}
	public static String redactPlayer() {
		return "REDACTED";
	}
}
