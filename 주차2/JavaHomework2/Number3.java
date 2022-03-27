package 주차2.JavaHomework2;

import java.util.Scanner;

public class Number3 {
    public static void main(String[] args) {
        long a = 0, b = 1, c= 0;
        int i =1;

        Scanner scan = new Scanner(System.in);
        System.out.print("몇번째 항 까지 출력하시겠어요? :");
        int j = scan.nextInt();
                for (i = 1; i <= j; i++) {
                    System.out.println(i+"번째 항은"+ c);
                    c = a+b;// 변수 a와 b를 더하여 변수 c에 대입한다.
                    a = b;// 변수 b의 값을 변수 a로 옮긴다.
                    b = c;// 변수 c의 값을 변수 b로 옮긴다.
                    }
}

}