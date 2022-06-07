package myPrac;

public class P_19_하향형변환_자바 {
    public static void main(String arg[]) {
		Shape2 s1, s2, s3, s4;
  
		s1 = new Shape2();
		s2 = new Rectangle2();
		s3 = new Triangle2();
		s4 = new Circle2();
  
		s1.draw();
		s2.draw();
		s3.draw();
		s4.draw();
	}

}

class Shape2 {
	protected int x, y;
  	public void draw() {
		System.out.println("Shape2 Draw");
	}
}
  
class Rectangle2 extends Shape2 {
	private int width, height;
	public void draw() {
		System.out.println("Rectangle2 Draw");
	}
}
class Triangle2 extends Shape2 {
	private int base, height;
  	public void draw() {
		System.out.println("Triangle2 Draw");
	}
}
  
class Circle2 extends Shape2 {
	private int radius;
  
	public void draw() {
		System.out.println("Circle2 Draw");
	}
}
