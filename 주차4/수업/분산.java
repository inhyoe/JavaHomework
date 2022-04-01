package 주차4.수업;
import java.util.Scanner;
import java.util.Arrays;
public class 분산 {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        
        int s[] = new int[10];
        int i ,sum =0;
        double avg, dsum =0;
        

        for(i = 0; i<10; i++)
            s[i] = (int)(Math.random()*10)+1; 
            // System.out.print(s[i]+" "); --> 대체하는 코드 Arrays.toString(s) ** 자주 쓸듯.
        
        System.out.println(Arrays.toString(s));

        for(i=0; i<s.length;i++)
            sum += s[i];
        // 평균값
        avg = (double)sum / s.length;
        System.out.println(avg);

        // 분산값

        for(i=0; i<s.length;i++)
            dsum += (s[i] - avg) * (s[i] -avg);
        
            System.out.printf("분산 = %.1f\n",dsum/s.length);
            System.out.printf("표준편차 = %.1f\n",Math.sqrt(dsum/s.length));
        
    }
}
