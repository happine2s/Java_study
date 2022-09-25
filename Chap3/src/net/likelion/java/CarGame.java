package net.likelion.java;

public class CarGame {

	public static void main(String[] args) {
		Car c1=new Car();
		//c1.model="Hyundai Sonata"; -> private 변수임으로 해당 클래스 밖에서 선언 불가
		c1.setColor("RED");
		c1.setModel("Hyundai Sonata");
		c1.setPower(180);
		
		Car c2=new Car("BLUE","BMW520",210);
		
		c1.go();
		c1.go();
		c2.go();
	}

}
