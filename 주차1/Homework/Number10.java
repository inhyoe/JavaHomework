package 주차1.Homework;

import java.util.Scanner;
public class Number10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("실수를 입력하세요");
        Double num = scan.nextDouble();
        
        System.out.printf("실수 입력 : %.1f \n반올림 정수 : %d",num ,Math.round(num));
    }
}
