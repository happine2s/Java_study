package net.likelion.java;

public class Gun {
	//Member var
	protected String model;
	protected int bulletCount;
	
	//Constructor
	public Gun(String model) {
		bulletCount=10;
		this.model=model;
	}
	
	//Method
	public void fire() {
		System.out.println(model+"=>");
		bulletCount-=1;
	}
}
