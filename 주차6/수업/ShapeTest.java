package 주차6.수업;

public class ShapeTest {
    Shape s = new Rectangle();
    // 업캐스팅은 되나, 부모타입의 선언된 멤버만 접근 가능
    Rectangle r = new Rectangle();

    // s.x = 0;
    // s.y = 0;

}
class Shape {
	protected int x, y;
}

class Rectangle extends Shape {
	private int width, height;
}

class Triangle extends Shape {
	private int base, height;
}

class Circle extends Shape {
	private int radius;
 }
