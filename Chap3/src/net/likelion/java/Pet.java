package net.likelion.java;

public class Pet {
	void bark() {
		System.out.println("pipi");
	}
	
	public static void main(String[] args) {
		Pet pet1=new Dog();
		pet1.bark();
		
		Pet pet2=new Cat();
		pet2.bark();
	}
}

class Dog extends Pet{
	void bark() {
		System.out.println("woof woof");
	}
}

class Cat extends Pet{
	void bark() {
		System.out.println("mew mew");
	}
}