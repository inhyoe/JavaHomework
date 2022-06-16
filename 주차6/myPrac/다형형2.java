public class 다형형2 {
    public static void main(String[] args) {
        Human h = new Name();
        h.call();

        Name n = (Name) new Human();
        n.call();
    }
}


class Human{
    public void call(){
        System.out.println("Humman call");
    }
}

class Name extends Human{
    public void call(){
        System.out.println("나는 철수");
    } 
    public void status(){
        System.out.println("나는 사람");
    }
}