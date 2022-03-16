package 주차2.Test;

import java.util.Scanner;

public class 약수 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("양의 정수를 입력하세요");
        int n = scan.nextInt();

        System.out.print(n + "의 약수는 다음과 같습니다.");

        for(int i =1; i<=n; ++i){
            if(n % i == 0){
                System.out.print(" "+i);
            }
        }
    }
}
