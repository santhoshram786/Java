package com.java.task3;

import java.util.Scanner;

public class Program_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "H i ho    w r yo u.";
		System.out.println("Original sentence: " + sentence);

		sentence = sentence.replaceAll("\\s", "");
		System.out.println("After replacement: " + sentence);
	}

}
