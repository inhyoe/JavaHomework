package 수업;

class Parent{
    public Parent(){
        System.out.println("P1");
    }
    public Parent(String k){
        System.out.println("P2");
    }
}
class Child extends Parent{

    public Child(){
        System.out.println("P1");
    }
    public Child(String m){
        Parent p = new Parent("k"); // = super()

        System.out.println("C2");
    }
}



public class 시험 {
    public static void main(String[] args) {
        Child c = new Child();
        // Child a = new Child("k");
        
    }
}
