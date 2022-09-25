package kr.hs.sunrint.java;
import parent.Parent;

public class Child extends Parent{
	int y=20;
	
	void childMethod() {
		System.out.println("자식메소드x="+x+" y="+y);
	}
	public static void main(String[] args) {
		Child child=new Child();
		child.childMethod();
		child.parentMethod();
	}
}
