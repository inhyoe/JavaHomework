package 주차4.Homework;

import java.util.Scanner; 

public class PracNum5 {
    public static void main(String[] args) {
        int student, score, sum= 0,i =0;
        int arr[];
        
        Scanner scan = new Scanner(System.in);
        student = scan.nextInt();
        arr = new int[student];

        for(i = 0; i<student; i++){
            System.out.print("학생 "+(i+1)+"의 성적을 입력하시오");
            score = scan.nextInt();
            if(score>100){
                System.out.print("잘못된 성적입니다. 다시 입력하세요.");
                score = scan.nextInt();
                arr[i] = score;
            }else{
                arr[i] = score;
            }
        }
        for( int num :arr ){
            sum += num;
        }
        System.out.print("성적 평균은" + sum/arr.length);
    }
}
