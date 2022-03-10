package JavaHomework.주차1.Homework;

import java.util.Scanner;

public class Number7 {
    public static void main(String[] args) {
        System.out.print("정수를 입력하시오 : ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.print("정수를 입력하시오 : ");
        int b = scan.nextInt();
        System.out.print("정수를 입력하시오 : ");
        int c = scan.nextInt();
        if( a > b && b > c ){
            System.out.println("정렬된 숫자 :"+c+""+b+""+a);
        }else if(a > c && c > b){
            System.out.println("정렬된 숫자 :"+b+""+c+""+a);
        }else if(c > a && a > b){
            System.out.println("정렬된 숫자 :"+b+""+a+""+c);
        }else if(c > b && b > a){
            System.out.println("정렬된 숫자 :"+a+""+b+""+c);
        }else if(b >c && c > a){
            System.out.println("정렬된 숫자 :"+a+""+c+""+b);
        }else if(b > a && a > c){
            System.out.println("정렬된 숫자 :"+c+""+a+""+b);
        }
    }
}

