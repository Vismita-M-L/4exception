package com.techlabs.exception;

public class AgeNotValidException extends RuntimeException{
	int age;
	public AgeNotValidException(int age)
	{
		this.age=age;
	}
	public String getMessage()
	{
		return"age should be grater than or equal to 18"+":"+"you have entered:"+age;
	}

}
