package Homework;


public class Cylinder extends Circle{
    private double height;

    Cylinder(){
        //super.~~ 쓸때는 이름이 충돌할 때 만 씀.
    }
    Cylinder(double radius){
        super(radius);
    }
    Cylinder(double radius,double height){
        super(radius);
        setHeight(height);
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public double getVolume(){
        double volume =  getArea() * getHeight();
        return volume;
    }
    public static void main(String[] args) {
        Cylinder obj1 = new Cylinder();
        
        obj1.setRadius(10.1);
        obj1.setHeight(15.0);
        System.out.println(obj1.getVolume());
        System.out.println(obj1.getArea());

        Cylinder obj2 = new Cylinder(5.0,3.0);
        double Volume = obj2.getVolume();
        double Height = obj2.getHeight();
        double Area = obj2.getArea();
        double Radius = obj2.getRadius();
        System.out.printf("Volume : %s  \n Height: %s \n Area: %s \n Radius: %s", Volume,Height,Area,Radius);
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
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea(){
        return radius *radius * 3.14;
    }
}