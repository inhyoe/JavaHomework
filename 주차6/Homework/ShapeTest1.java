public class ShapeTest1 {
    public static void main(String[] args) {
        Shape s1 = new Rectangle(10, 20);
        s1.calcArea();
        System.out.println(s1);
        Shape s2 = new Triangle(10, 20);
        s2.calcArea();
        System.out.println(s2);
    }
}


abstract class Shape{
    private String color;
    public void calcArea(){}
    @Override
    public String toString() {
        return "A";
    }
}

class Rectangle extends Shape{
    private int length;
    private int width;
    public int area;

    Rectangle(int length, int width){
        this.length =length;
        this.width = width;
    }
    public void calcArea() {
        area = length * width;
    }
    @Override
    public String toString() {
        return String.format("넓이는 : %d %d",area,length);
    }
    
}

class Triangle extends Shape{
    private int base;
    private int height;
    private int area;

    Triangle(int base,int height){
        this.base = base;
        this.height = height;
    }
    public void calcArea(){
        area = (int) (base*height*0.5);
    }
    @Override
    public String toString() {
        return String.format("넓이는 : %d %d %d", area,base,height);
    }

}
