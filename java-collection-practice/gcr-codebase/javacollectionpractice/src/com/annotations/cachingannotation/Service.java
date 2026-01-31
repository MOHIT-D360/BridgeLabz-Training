package com.annotations.cachingannotation;

public class Service {
	@CacheResult
	public int square(int n) {
		
		return n*n;
	}
}
