package 주차6.수업;

class Animal{
    public void sound(){
        System.out.println("...");
    }
}

class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("멍멍!");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
