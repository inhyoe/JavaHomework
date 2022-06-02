import java.util.ArrayList;

public class P_40_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("MILK");
        list.add("BREAD");
        list.add("BUTTER");
        System.out.println("list.set() : "+list);
        list.add(1, "APPLE"); // 인덱스 1에 "APPLE"을 삽입
        System.out.println("list.add(index,element) add : "+list);
        list.set(2, "GRAPE"); // 인덱스 2의 원소를 "GRAPE"로 대체
        System.out.println("list.set() , 대체 : "+list);
        list.remove(3); // 인덱스 3의 원소를 삭제한다.
        list.add("MILK");
        System.out.println(list);
    }
}
