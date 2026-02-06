package com.streamsapi;
import java.util.*;
import java.util.stream.*;
import java.time.LocalDateTime;

public class TransactionsLogger {
	public static void main(String[] args) {
		List<Long> transactionId = Arrays.asList(101L,102L,103L,104L);
		transactionId.stream()
		.forEach(id->System.out.println(LocalDateTime.now()+ " Transaction: "+id));
	}
}
