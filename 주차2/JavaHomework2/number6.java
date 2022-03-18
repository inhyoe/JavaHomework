package 주차2.JavaHomework2;

import java.util.Scanner;

public class number6 {
    public static void main(String[] args) {
        int a;
        int divisor =0;
        int primary;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();

        for( int i =1; i<=a; i++)
            if(a%i == 0){ // 약수 구하기
                // 20 입력
                // 5 걸림
                for(int j=1; j<=i; j++){
                    // 1~5까지 나눔 
                    if(i%j ==0){
                    // 1이 걸리고 5도 걸려서 divisor에 2가 입력됨
                        divisor +=1;
                    }
                }
                if(divisor == 2){
                    System.out.println("소인수는"+i);
                }
                divisor =0;
            }
    }
}
