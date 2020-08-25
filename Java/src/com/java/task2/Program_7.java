package com.java.task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Program_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string = "2020-05-24";
        LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);

        System.out.println(date);

	}

}
