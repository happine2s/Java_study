package com.dinfree.java.part1;

public class Variables {
	
	int num1; //멤버변수, 인스턴스 변수
	static int num2; //멤버변수, 클래스 변수
	
	//메소드
	public void printName(String name) {
		String prtMsg=name+" Hello"; //지역변수
		//int num1=this.num1;
		System.out.println(prtMsg);
	}
	
	
	public static void main(String[] args) { //static main은 클래스가 실행되기 전에 먼저 실행됨
		Variables mc = new Variables();
		mc.num1=100;
		Variables.num2=50;
		
		mc.printName("박소윤"); //인자로 매개변수에 값을 전달
		
		System.out.printf("%d %d",mc.num1, Variables.num2);
	}

}