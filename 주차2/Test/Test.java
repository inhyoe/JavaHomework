package 주차2.Test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, sum =0;
        System.out.print("입력하세요");
        n = scan.nextInt();
        

        while(n > 0){
            sum += n%10; // 12345 = 5
            n /= 10; // 12345/10 =1234.5
        
        }
        System.out.println("각 자리수의 합"+sum);
    }
}
