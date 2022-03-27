package 주차3.Homework;
import java.util.Scanner;
public class Number1_2 {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        int a=num.nextInt(), b=num.nextInt(), i, n=0, max=0; //a,b입력
        for(;a<=b;a++){ //입력한 a부터 b까지 연산하기위해
            for(n=1, i=a; i>1; n++){ //하나의 수를 1이 나올때까지 연산, n구하기
                if(i%2==0) i/=2; else i=i*3+1; //연산
            } if(max<n) max=n; //연산 중 최대의 n구하기
        } System.out.println(max); //출력
    }
}
