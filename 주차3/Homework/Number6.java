package 주차3.Homework;

import java.util.Scanner;

public class Number6 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String n;
        n = scan.nextLine();

        System.out.println(get(n));
        
    }

    

    static String get(String n) {
        String Back = "";
        int i = n.length()-3;
        if (n.indexOf(".") > -1) { // 소숫점이 들어갔을때,
            n = n.substring(0, n.indexOf("."));  
            Back = n.substring(n.indexOf("."), n.length()); // 끝문자열 그대로 출력
            
        }
        while(i >0){
            n = n.substring(0, i) + "," + n.substring(i,n.length());
            // 먼저 0~i-3 문자열까지 출력한 후
            //  , 를 더하고 나머지 문자열을 출력한다
            // 이 작업을 반복해준다. 10,000,000
            i -= 3;
        }
        return n + Back; // 소숫점까지 리턴
    }

}
