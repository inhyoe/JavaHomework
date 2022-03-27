package 주차3;
import java.util.Scanner;
public class 유클리드 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("x입력");
        int x = scan.nextInt();
        System.out.print("y입력");
        int y = scan.nextInt();
        int g = gcd(x,y);
        int l = x*y/g;
        System.out.println("최대공약수 = " + g);
        System.out.println("최소공배수 = " + l);
    }
    static int gcd(int x, int y){
        int r;
        while(y !=0){
            r = x%y;
            x =y;
            y =r;
        }
        return x;
        
    }
}
