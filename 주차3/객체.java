package 주차3;

public class 객체 {
    public static void main(String[] args) {
        String s1 = "hello"; // 문자열 객체.
        String s2 = new String("hello");  // 문자열 상수는 절대 바뀌지 않으며, replace값은 새로운 값을 반환하는 것 이다.
        String s3 = "hello"; // 문자열 객체.
        String s4 = new String("hello"); 

        System.out.println(s2 == s4); // 메모리상 다른 곳에 할당됨.(new는 항상 새로운것)
        System.out.println(s1 == s3); // 문자열은 같음(기존 할당된 값을 참조함.)
        System.out.println(s1.equals(s2)); // 내부 값 비교 
        // compareTo 대문자 < 소문자
        
        s1+= "World";
        System.out.println(s1); // 새로운 문자열이 생성됨 (메모리에는 hello , World, helloWorld가 있다.) ==> hello는 가비지 컬렉터에 저장됨.
                                // 한마디로 참조하는 값이 달라진 것. => 반복문 내에서는 가비지를 만들면 안됨. (반환값 String 함수 주의)
                                // string 에 +연산자 사용 주의할 것. 그러므로 가비지 내에서는 StringBuffer을 사용.
                                
    }
}
