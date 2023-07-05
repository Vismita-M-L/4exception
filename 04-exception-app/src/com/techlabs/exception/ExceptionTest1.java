package com.techlabs.exception;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionTest1 {

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        try {
	            System.out.print("Enter a number: ");
	            int num1 = Integer.parseInt(scanner.nextLine());
	            
	            System.out.print("Enter another number: ");
	            int num2 = Integer.parseInt(scanner.nextLine());
	            
	            int result = num1 / num2;
	            System.out.println("Result: " + result);
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid number format entered.");
	        
	    }
	    }
}

