package 수업;

abstract class Animal{
    abstract void speak(); // 오버라이딩이 아닌 재정의가 가능하기 때문에 사용한다.
}

class Dog extends Animal{
    void speak(){
        System.out.println("Bark");
    }
}

class Cow extends Animal{
    void speak(){
        System.out.println("음메");
    }
}

class Cat extends Animal{
    void speak(){
        System.out.println("Meow");
    }
}
public class UpcastingTest {
    public static void main(String[] args) {
        Animal[] ani = {new Dog(),new Cat(),new Cow()}; // 이 부분만 바꾸면 된다.
        
        for(Animal a : ani) // 이 부분을 바꿀 필요 없이 -> 28줄
            a.speak();
        
    }
}
