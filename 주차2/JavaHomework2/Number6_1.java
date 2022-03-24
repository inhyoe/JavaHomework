package 주차2.JavaHomework2;

import java.util.Scanner;

public class Number6_1 {
    public static void main(String[] args) {
        int a;
        int divisor =0;
        
        System.out.print("자연수를 입력해주세요 :");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();

        for( int i =1; i<=a; i++)
            if(a%i == 0){ 
                
                // for(int j=1; j<=i; j++)
                //     if(i%j ==0)
                //         divisor +=1;
                divisor +=findDivisor(i);
                if(divisor == 2)
                    System.out.println("소인수는"+i);
                
                divisor =0;
            }
    }
    static int findDivisor(int i){
        int divisor = 0;
        for(int j=1; j<=i; j++){
            if(i%j ==0)
            divisor +=1;
        }
            return divisor;
        }
        
    }
    

