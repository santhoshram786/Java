package com.java.task3;

import java.time.LocalDateTime;

public class Program_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime dateTime = LocalDateTime.of(2020, 7, 31, 0, 0);
		LocalDateTime dateTime2 = LocalDateTime.now();
		int diffInNano = java.time.Duration.between(dateTime, dateTime2).getNano();
		long diffInSeconds = java.time.Duration.between(dateTime, dateTime2).getSeconds();
		long diffInMilli = java.time.Duration.between(dateTime, dateTime2).toMillis();
		long diffInMinutes = java.time.Duration.between(dateTime, dateTime2).toMinutes();
		long diffInHours = java.time.Duration.between(dateTime, dateTime2).toHours();
		System.out.printf("\nDifference is %d Hours, %d Minutes, %d Milli, %d Seconds and %d Nano\n\n", diffInHours,
				diffInMinutes, diffInMilli, diffInSeconds, diffInNano);

	}

}
