package JavaHomework.주차1.Homework;
import java.util.Scanner;


public class Number6_1 {
public void turn(int number){
if(number==0){
return;
}else{
turn(number/2);
System.out.print(number%2+"");
}
}
public static void main(String[] args) {
Number6_1 num = new Number6_1();

Scanner scan = new Scanner(System.in);
System.out.print("10진수를 입력해 주세요 : ");
int number = scan.nextInt();
System.out.print(number+"의 2진수는 : ");
num.turn(number);
}
}