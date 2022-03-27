package 주차2.Test;

import java.util.Scanner;

public class Uclid {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("x입력");
        int x = scan.nextInt();
        System.out.print("y입력");
        int y = scan.nextInt();

        while(y != 0){
            int r = x % y;
            x = y;
            y = r;
            
        }
        System.out.println("최대공약수는 : " + x);
    }
}
