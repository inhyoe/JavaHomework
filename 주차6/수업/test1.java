package 수업;

public class test1 {
   
    public static void main(String[] args) {
        Circle2 c = new Circle2();
        Rectangle2 r = new Rectangle2();
        Shape2 s2 = new Circle2();    // Upcasting = 상향 형변환
        Shape2 s1 = new Rectangle2(); // Upcasting = 상향 형변환
        // Shape2 s2 = new Shape2();
        // Shape2 s1 = new Shape2();
        s1.draw2();
        s2.draw2();
        c.draw2();
        r.draw2();
}
}
abstract class Shape2{
    protected int x,y;
    public void move(int x, int y){
        this.x =x;
        this.y =y;
    }
    public abstract void draw2();
}

class Rectangle2 extends Shape2{
    private int width, heigth;
    public void draw2(){
        System.out.println("사각형 그리기 메소드");
    }
}

class Circle2 extends Shape2 {
    private int radius;
    public void draw2(){
        System.out.println("원 그리기 메소드");
    }
}