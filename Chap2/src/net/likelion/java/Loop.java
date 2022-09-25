package net.likelion.java;

public class Loop {

	public static void main(String[] args) {
		int power=13;
		String members[]= {"홍길동","김길동","김사랑","아무개"};
		
		//구구단
		for(int j=2;j<10;j++) {
			for(int i=1;i<10;i++) {
				System.out.printf("%d*%d=%d\n",j,i,i*j);
			}
		}
		
		
		System.out.println("===============");
		
		for(int i=0;i<members.length;i++) {
			System.out.println(members[i]);
		}
		
		System.out.println("===============");
		
		for(String name:members) {
			System.out.println(name);
		}
		
		System.out.println("===============");
		
		while(power>10) {
			System.out.println("go");
			power--;
		}
		System.out.println("stop");

	}

}
