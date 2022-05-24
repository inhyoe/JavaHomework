import java.util.ArrayList;
import java.util.Scanner;

public class Number4_1 {
 public String name;
 public String address;
 public String phone;

 public Number4_1(String name, String address, String phone) {
  this.name = name;
  this.address = address;
  this.phone = phone;
 }

 public static void main(String str[]) {
  Scanner scan = new Scanner(System.in);
  String name;
  String address;
  String phone;
  int num;
  ArrayList<Number4_1> list = new ArrayList<Number4_1>();
  Number4_1 student;
  student = new Number4_1("홍길동", "서울", "123-4567");
  list.add(student);
  student = new Number4_1("김유신", "부산", "753-6789");
  list.add(student);
  student = new Number4_1("김춘추", "경주", "982-2349");
  list.add(student);
  student = new Number4_1("계백", "광주", "542-6734");
  list.add(student);
  while (true) {
   System.out.println("1.추가 2.검색 3.삭제 4.종료");
   num = scan.nextInt();
   switch (num) {
   case 1:
    System.out.print("이름 : ");
    name = scan.next();
    System.out.print("주소 : ");
    address = scan.next();
    System.out.print("전화번호 : ");
    phone = scan.next();
    student = new Number4_1(name, address, phone);// 입력받은 데이터로 객체 생성
    list.add(student);// 리스트에 넣기
    break;
   case 2:
    System.out.print("검색 이름 : ");
    name = scan.next();
    for (Number4_1 s : list) {
     if (s.name.equals(name))// 찾는 이름을 찾으면 화면에 출력
     {
      System.out.println("=====검색된 학생=====");
      System.out.println("이름 : " + s.name);
      System.out.println("주소 : " + s.address);
      System.out.println("전화번호 : " + s.phone);
      System.out.println("====================");
     }
    }
    break;
   case 3:
    System.out.print("삭제할 이름 : ");
    name = scan.next();
    for (Number4_1 s : list) {
     if (s.name.equals(name))// 삭제할 객체를 찾으면
     {
      list.remove(s);// 삭제
      break;
     }
    }
    break;
   case 4:
    return;
   }
  }
 }
}