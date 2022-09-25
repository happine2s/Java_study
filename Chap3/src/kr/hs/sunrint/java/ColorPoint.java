package kr.hs.sunrint.java;

public class ColorPoint extends Point {
	private String color;
	
	public void setColor(String color) {
		this.color=color;
	}
	public void showColorPoint() {
		System.out.println(color);
		showPoint(); //부모클래스 Point의 showPoint()메소드 호출
	}
}
