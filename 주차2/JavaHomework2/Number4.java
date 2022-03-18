package 주차2.JavaHomework2;

import java.util.Scanner;

public class Number4 {
    public static void main(String[] args) {
        int num;
        double sum = 0;
        double i = 1;

        System.out.print("num을 입력하시오");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();

        while( i <= num){
            sum += 1/i;
            i++;
        }
        System.out.print("수열의 합은 : " + sum);
    }
}
