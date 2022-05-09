package 주차6.수업;

class Base{
    public Base(){
        System.out.println("Base()생성자");
    }
    public Base(String msg){
        System.out.println("Base2()생성자");
    }
    public Base(String msg,String msg2){
        System.out.println("Base3()생성자");
    }
}

class Derived extends Base{
    public Derived(){
        // super("ME","me2");
        System.out.println("Deived 생성자");
    }
}


public class Test {
    public static void main(String[] args) {
        Derived r = new Derived();
    }
}
