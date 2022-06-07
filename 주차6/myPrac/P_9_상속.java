package myPrac;


public class P_9_상속 {
    public static void main(String[] args) {
        Derived d = new Derived();
    }
}

class Base{
    Base(){
        System.out.println("기본 생성자");
    }
    public Base(String msg){
        System.out.println("Base()생성자");
    }
}

class Derived extends Base{
    public Derived(){
        super("msg");
        System.out.println("Derived 생성자");
    }
}