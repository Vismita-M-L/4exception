package com.techlabs.exception;

public class Voter {
	private int custid;
	private String name;
	private int age;
	public Voter(int custid, String name, int age) {
		super();
		this.custid = custid;
		this.name = name;
		
			if(age<18)
				throw new AgeNotValidException(age);
			this.age = age;
		}
		
	
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if (age<18)
			throw new AgeNotValidException(age);
		this.age = age;
	}
	@Override
	public String toString() {
		return "Voter [custid=" + custid + ", name=" + name + ", age=" + age + "]";
	}
	

}
