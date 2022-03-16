package 주차1.what;

import java.util.Scanner;

import javax.print.FlavorException;

public class shit4 {
    

    public static void main(String[] args) {
        float a,b,c,D;
        System.out.print("a,b,c 차례대로");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        

        // 판별식
        D = b*b - 4*a*c;

        // 근의공식
        
        if(D<0){
            System.out.println("근이 없음");
        }else if(D==0){
            System.out.println("중근 = " + -b/(2.0*a));
        }else{
            System.out.printf(
                "두 실근 : %.1f,%.1f\n" ,(-b+Math.sqrt(b))/(2.0*a)
                ,(-b-Math.sqrt(b)/(2.0*a)) );
                // %b -정수 , %f.1(소수점 1자리) 실수 \n 줄바꿈 
        }
    }


}
