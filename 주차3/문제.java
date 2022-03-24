package 주차3;
import java.util.Scanner;
public class 문제 {
    public static void main(String[] args) {
        //영문장 입력 : Hello World
        //대문자 = 2개
        // 소문지 = 8개
        //빈칸 = 1개
        int upper=0, lower=0, blank =0;
        Scanner scan = new Scanner(System.in);
        System.out.print("입력");
        String x = scan.nextLine();
        

        for(int i=0; i<x.length(); i++){
            if(x.charAt(i) >='A' && x.charAt(i) <= 'Z')
                upper++;
            if(x.charAt(i)>='a'&& x.charAt(i)<='z'){
                lower++;
            }
            if(x.charAt(i) == ' ')
                blank++;
            }
        System.out.println("대문자는 :" + upper);
        System.out.println("소문자는 :" + lower);
        System.out.println("공백은 :" + blank);
}
}