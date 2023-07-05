package com.techlabs.exception;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws {
		Scanner scanner=new Scanner(System.in);
		try {
			int a= scanner.nextInt();
			int b= scanner.nextInt();
			double c=a/b;
			System.out.println(c);
		}
		catch(ArithemeticException e){
			System.out.println("Cant divide by zero");
		
		}
		catch(ArrayIndexoutOfboundsException e){
			System.out.println("please provide two arguments");
		
		}

	}

}
