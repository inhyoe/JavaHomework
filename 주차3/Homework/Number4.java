package 주차3.Homework;
import java.util.Scanner;
public class Number4 {
    static int y = -1; // 계속 증가할 수 넣어줌.
    static int getInt(int n){
        
        String x = Integer.toString(n);
        if(n == 0)
            return 0; // 0일경우 0을 리턴
        
        if(x.charAt(x.length()-1) == '1'){
            y++;
            return (int)Math.pow(2,y)+getInt(n/10);
            // 1일경우 자릿수만큼 y의 제곱을한다. 그리고 10을 나눈다.
        }else{
            y++;
            return getInt(n/10);
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(getInt(n));
    }
}
