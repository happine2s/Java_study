package kr.hs.sunrint.java;

public class Car {
	String brand, color;
	int speed;
	
	Car(){
		brand="선린";
		color="black";
		speed=0;
	}
	
	void speedUp() {
		speed+=5;
	}
	void speedDown() {
		speed-=5;
	}
}
