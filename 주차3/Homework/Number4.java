package 주차3.Homework;
import java.util.Scanner;
public class Number4 {
    static int y = -1;
    static double getInt(int n){
        
        String x = Integer.toString(n);
        if(n == 0)
            return 0;
        
        if(x.charAt(x.length()-1) == '1'){
            Math.pow(y,2);
            y++;
            return Math.pow(2,y)+getInt(n/10);
        }
        else{
            y++;
            return getInt(n/10);
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println((int)getInt(n));
    }
}
