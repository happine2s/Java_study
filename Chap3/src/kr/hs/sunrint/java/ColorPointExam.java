package kr.hs.sunrint.java;

public class ColorPointExam {

	public static void main(String[] args) {
		Point p=new Point();
		p.set(1, 2);
		p.showPoint();
		
		ColorPoint cp=new ColorPoint();
		cp.set(3, 4); //Point의 set() 메소드 호출
		cp.setColor("red"); //ColorPoint의 setColor() 메소드 호출
		cp.showColorPoint();
	}
}
