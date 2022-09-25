package com.dinfree.java.part1;

public class Methods {
	
	String name;
	
	//생성자
	Methods(){
		name="박소윤";
		System.out.printf("#생성자: %s\n", name);
	}
	
	//메소드
	void printName() {
		System.out.printf("#printName(): %s\n", name);
	}
	//메소드 오버로딩
	void printName(String name) { //인자가 다르다
		System.out.printf("#printName(String name): %s\n", name);
	}
	void printName(String...name) { //가변인자
		System.out.println("#printName(String...name)");
		for(String s: name) {
			System.out.println(s);
		}
	}
	
	int calc(int num1, int num2) { //리턴타입이 있는 메소
		return num1+num2;
	}
	
	public static void main(String[] args) {
		Methods m = new Methods();
		m.printName();
		m.printName("인자이름");
		m.printName("최선미","박주삼","박채은");
		System.out.printf("#calc(int num1, int num2): %d",m.calc(20, 50));
	}

}
