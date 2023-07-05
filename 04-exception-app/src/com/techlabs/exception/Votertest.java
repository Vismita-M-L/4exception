package com.techlabs.exception;

public class Votertest {

	public static void main(String[] args) {
		try
		{
		Voter voter= new Voter(11,"Vismita",16);
		System.out.println(voter);
		}
		catch(AgeNotValidException e)
		{
			System.out.println(e.getMessage());
			
		}

	}

}
