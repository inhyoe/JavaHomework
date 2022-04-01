package 주차3.Homework;

import java.util.Scanner;

public class 김병신 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("2진수 입력: ");
        int two = sc.nextInt();
        System.out.println(ten(two));
        
    }

    static int w = 0;
    static int sum = 0;
    public static int ten(int x) {
        if(x == 0){
            return 0;
        }
        if (x > 0) {
            int k = 0;
            int t = x % 10;
            k = (int) Math.pow(2, w);
            t = t * k; // t = 1*1; ->
            sum = t; // sum = 0+1;
            System.out.println(sum);
            w++;
            return sum +ten(x/10);

        } else
            return ten(x/10);
    }
}
