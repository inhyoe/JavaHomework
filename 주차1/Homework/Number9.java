package 주차1.Homework;

import java.util.Scanner;
public class Number9 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("사칙연산을 입력해주세요");
        String cal = scan.nextLine();

        System.out.print("숫자를 입력해주세요");
        int first = scan.nextInt();

        System.out.print("숫자를 입력해주세요");
        int second = scan.nextInt();

        if(cal.equals("+"))
            System.out.println(first+second);
        
        else if(cal.equals("-"))
            System.out.println(first-second);
        
        else if(cal.equals("*"))
            System.out.println(first*second);

        else{
            if(second !=0)
                System.out.println(first/second);
            else
                System.out.println("분모가 0입니다 제대로 입력해 주세요");
            
        }
    }    
}
