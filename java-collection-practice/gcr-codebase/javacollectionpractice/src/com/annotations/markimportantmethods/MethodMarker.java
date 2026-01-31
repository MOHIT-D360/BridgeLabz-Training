package com.annotations.markimportantmethods;

public class MethodMarker {
	@ImportantMethod (level = "Normal")
	public void method1() {
		
	}
	@ImportantMethod (level = "Low")
	public void method2() {
		
	}
}
