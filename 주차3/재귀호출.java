package 주차3;
import java.util.Scanner;
public class 재귀호출 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.println(sum(x,y));
    }
    static int sum(int a, int b){
        if(a == b)
            return a;
        return sum(a+1,b)+a;
    }
}
