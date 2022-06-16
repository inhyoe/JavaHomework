public class P_15_상향형변환 {
    public static void main(String[] args) {
        Shape s = new Rectangle();
        Rectangle r = new Rectangle();

        Rectangle r1 = (Rectangle)s;
        Shape s1;

        s1 =new Rectangle();
        r1 = (Rectangle)s;

        // r1.width = 100;
        // r1.height = 100; 
        
        s.x = 10;
        s.y = 10;


        // s.width = 10;
        // s.height = 10;

    }
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
