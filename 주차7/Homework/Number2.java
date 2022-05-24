import java.text.Format;

/* 제네릭을 사용하여서 똑같은 타입의 객체 두개를 저장하는 Pair 클래스를 작성하여 보자. 
생성자와 접근자, 설정자, toString() 메소드를 정의하라. 
String을 저장하여 다음과 같이 테스트하여 보라. */

public class Number2 {
    public static void main(String[] args) {
        MyPair<String> fruit = new MyPair("사과","포도");
        System.out.println(fruit);
    }
}

class MyPair<T>{
    private T a;
    private T b;
    public MyPair(){

    }
    public MyPair(T a, T b){
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format(
            "%s,%s",a,b
        );
    }
}