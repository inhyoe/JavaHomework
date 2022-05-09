package 주차6.수업;

class Shape1 {
	protected int x, y;
	public Shape1(){
		System.out.println("기본생성자");
	}
  	void draw1() {
		System.out.println("Shape1 Draw");
	}
}
  
class Rectangle1 extends Shape1 {
	
	private int width, height;
	void draw1() { /* 다형성 */
		System.out.println("Rectangle1 Draw");
	}
}


class Triangle1 extends Shape1 {
	private int base, height;
  	public void draw1() {
		System.out.println("Triangle1 Draw");
	}
}
  
class Circle1 extends Shape1 {
	private int radius;
  
	public void draw1() {
		System.out.println("Circle1 Draw");
	}
} 



public class Tst2 {
	public static void main(String[] args) {
		Shape1 s1,s2, s3, s4;
		
		s1 = new Shape1();
		s2 = new Rectangle1();
		s3 = new Triangle1();
		s4 = new Circle1();
		
		s1.draw1();
		s2.draw1();
		s3.draw1();
		s4.draw1();
		
		
	}
}