package com.sam;

import java.util.Scanner;

/**
 * @author Hossaini sam
 * date 06/06/2024
 * A java implementation of Hello World
 */

public class HelloWorld {
	/**
	 * Main method
	 * @param args Command line arguments
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//
		System.out.println("Please enter your name");
		String name = input.nextLine();
		System.out.println("Please enter a greeting");
		String greeting = input.nextLine();
		
	}
	/**
	 * Creates a greeting using a custom greeting and name
	 * @param greeting What greeting to use
	 * @param name Who to greet 
	 * @return The greeting
	 */
	
	public static String generateGreeting(String greeting, String name) {
		return greeting +", "+ name;
	}
	
}
