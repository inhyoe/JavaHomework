package 주차1.Homework;

import java.util.Scanner;

public class Number6 {
    public static void main(String[] args) {
        int Number;
        int first;
        int second;
        int third;
        int four;
        Scanner scan = new Scanner(System.in);
        System.out.print("정수 : ");
        Number = scan.nextInt();
        
        // String four1 = String.valueOf(four);

        if(Number<=1){
            first= Number%2 ;
            System.out.println(first);
            String first1 = String.valueOf(first);
            System.out.println(first1);

        }else if(Number<=3){
            second = Number%2;
            Number = Number/2;
            first = Number%2;
            String first1 = String.valueOf(first);
            String second1 = String.valueOf(second);
            System.out.println(first1+second1);

        }else if(Number<=7){
            //1 2 4 8 16 32 
            third = Number%2;
            Number = Number/2;
            second = Number%2;
            Number = Number/2;
            first = Number%2;
            String first1 = String.valueOf(first);
            String second1 = String.valueOf(second);
            String third1 = String.valueOf(third);
            System.out.println(first1+second1+third1);
        }else if(Number<=15){
            four = Number%2;
            Number = Number/2;
            third = Number%2;
            Number = Number/2;
            second = Number%2;
            Number = Number/2;
            first = Number%2;
            String first1 = String.valueOf(first);
            String second1 = String.valueOf(second);
            String third1 = String.valueOf(third);
            String four1 = String.valueOf(four);
            System.out.println(first1+second1+third1+four1);
        }

    }
}
