package kr.hs.sunrint.java;

public class Truck extends Car{
	//Member var: Car, Truck 합쳐서 총 5
	int ton=1, weight=0;
	
	//Method: Car, Truck 합쳐서 총 4개
	void loadUp(int weight) {
		this.weight=weight;
	}
	void loadDown() {
		this.weight=0;
	}
	
	public static void main(String[] args) {
		Truck t = new Truck();
		t.speedUp();
		t.loadUp(10);
		System.out.println(t.ton+"톤 "+t.brand+" 트럭");
		System.out.println("speed: "+t.speed+", 짐 무게: "+t.weight+"kg");

	}

}
