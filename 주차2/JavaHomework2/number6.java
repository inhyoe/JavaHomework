package 주차2.JavaHomework2;

import java.util.Scanner;

public class number6 {
    public static void main(String[] args) {
        int a;
        System.out.print("소인수 분해 값 입력");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        // 20이 입력되면 2*2*5 가 출력 되어야 함.
        // 과정 -> 약수를 먼저 구한 후 . 반복문을 돌면서

        System.out.print("소인수 분해 값은");
        for (int i = 2; i <= a; i++) {
            while (a % i == 0) {
                System.out.print(i + " ");
                a = a / i;
            }
        }
    }
}
