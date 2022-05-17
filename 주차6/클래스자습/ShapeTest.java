package 주차6.클래스자습;

class Shape{
    protected int x,y;
}

class Rectangle extends Shape{
    private int width,height;
}

class Triangle extends Shape{
    private int base,height;
}

class Circle extends Shape{
    private int radius;
}
public class ShapeTest {
    public static void main(String[] args) {
        Shape s1,s2;

        s1 = new Shape();
        s2 = new Triangle();// 상향 형변환이 일어났다.    
        s1.x = 10;
        s1.y = 10;

        s2.x = 10;
    }
    

}
