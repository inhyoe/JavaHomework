package 주차1.Homework;

import java.util.Scanner;

public class Number6 {
    void Mehtod(int inputValue){
        if(Number<=1){

        }
    }
    public static void main(String[] args) {
        int Number;
        int first;
        int second;
        int third;
        int four;
        int five;
        int six;
        int seven;
        Scanner scan = new Scanner(System.in);
        System.out.print("정수 : ");
        Number = scan.nextInt();

        if(Number<=1){
            first= Number%2 ;
            
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
        }else if(Number<=31){
            five = Number%2;
            Number = Number/2;
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
            String five1 = String.valueOf(five);
            System.out.println(first1+second1+third1+four1+five1);
        }else if(Number<=63){
            six = Number%2;
            Number = Number/2;
            five = Number%2;
            Number = Number/2;
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
            String five1 = String.valueOf(five);
            String six1 = String.valueOf(six);
            System.out.println(first1+second1+third1+four1+five1+six1);
        }else if(Number<=99){
            seven = Number%2;
            Number = Number/2;
            six = Number%2;
            Number = Number/2;
            five = Number%2;
            Number = Number/2;
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
            String five1 = String.valueOf(five);
            String six1 = String.valueOf(six);
            String seven1 = String.valueOf(seven);
            System.out.println(first1+second1+third1+four1+five1+six1+seven1);
        }else{
            System.out.println("out of range");
        }

    }
}
