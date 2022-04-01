package 주차3.Homework;
import java.util.Scanner;
public class Number3 {
    static void getInt(int n){
        // 관계를 따지자.
        if(n==0)
            return;
        
        getInt(n/2);
        System.out.print(n%2);
         // 출력 순서에 유의하자.
    }

    static int decToBin(int d){
        if(d == 0)
            return 0;
        return decToBin(d/2) * 10 + d%2;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("10진수 입력 : ");
        int n = scan.nextInt();
        getInt(n);
        System.out.println("\n"+decToBin(n));
    }

    
}
