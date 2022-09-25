package net.likelion.java;

public class ShotGun extends Gun {
	//Constructor
	public ShotGun(String model) {
		super(model);
	}

	//Method
	public void fire() {
		bulletCount-=1;
		System.out.printf("%s =}}, %d\n", model, bulletCount);
	}
	

}
