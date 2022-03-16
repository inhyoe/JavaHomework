package 주차2.Test;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        long fact = 1;
        int num;

        System.out.print("정수를 입력하세요: ");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        

        for( int i = 1; i <= num; i++){
            fact = fact*i;
        }

        System.out.printf("%d!은 %d입니다.", num, fact);
    }
}
