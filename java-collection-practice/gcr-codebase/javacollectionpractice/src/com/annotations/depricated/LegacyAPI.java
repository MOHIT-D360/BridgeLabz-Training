package com.annotations.depricated;

public class LegacyAPI {
	@Deprecated
	public void oldFeature() {
		System.out.println("this is old ");
	}
	
	public void newFeature() {
		System.out.println("this is new");
	}
}
