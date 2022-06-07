package Num2;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(){

    }

    public Cylinder(double radius){
        super(radius);
        System.out.println();
    }

    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    
    public double getArea(){
        double area = getHeight() * getArea();
        return area;
    }
    public static void main(String[] args) {
        Cylinder obj1 = new Cylinder(10);
        System.out.println();
        

    }
}

class Circle{
    private double radius;
    private String color;

    Circle(){

    }

    Circle(double radius){
        this.radius = radius;
    }

    Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }
    
    public double getArea(){
        return radius*radius;
    }

}
