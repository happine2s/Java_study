package net.likelion.java;

class Truck extends Car{
	int ton=1;
	int weight=0;
	
	void loadUp(int weight) {
		this.weight+=weight;
	}
	void loadDown() {
		this.weight=0;
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Truck t=new Truck();
		t.go();
		t.loadUp(10);
		t.setModel("sm");
		System.out.println(t.ton+"톤 "+t.getModel()+"트럭");
		System.out.println("speed: "+t.getCurSpeed()+", 짐 무게: "+t.weight+"kg");

	}

}
