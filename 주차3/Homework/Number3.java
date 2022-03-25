package 주차3.Homework;
import java.util.Scanner;
public class Number3 {
    static void getInt(int n){
        if(n==1){
            return;
        }
        getInt(n/2);
        System.out.print(n%2);
         // 출력 순서에 유의하자.
    }
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("10진수 입력 : ");
        n = scan.nextInt();
        getInt(n);
    }

    
}
