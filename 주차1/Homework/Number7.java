package 
주차1.Homework;

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

        int temp;
        if(a>b){
            temp = a;
            a = b;
            b = temp;
        }

        if(b>c){
            temp = b;
            b = c;
            c = temp;
        }
        if(a>b){
            temp = a;
            a = b;
            b = temp;
        }
        System.out.printf("%d>%d>%d",a,b,c);
        
        if(a > b){  // a > b
            if(a>c) // a > c > b
                if(b>c) // a > b > c
                System.out.printf("%d>%d>%d",a,b,c);
            else        // a > c > b
                System.out.printf("%d>%d>%d",a,c,b);
                System.out.printf("%d>%d>%d",c,a,b);

        }else{      // b > a
            if(b>c)
                if(a>c)
                System.out.printf("%d>%d>%d",b,a,c);
                else
                System.out.printf("%d>%d>%d",b,c,a);
            else      //c > b > a
            System.out.printf("%d>%d>%d",c,b,a);
        }


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

