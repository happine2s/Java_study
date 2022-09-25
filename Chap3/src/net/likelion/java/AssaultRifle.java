package net.likelion.java;

public class AssaultRifle extends Gun {
	//Method
	public void fire() {
		bulletCount-=5;
		System.out.printf("%s => => => =>, %d\n", model, bulletCount);
	}
	
	//Constructor
	public AssaultRifle(String model) {
		super(model);
		bulletCount=40;
	}
}
