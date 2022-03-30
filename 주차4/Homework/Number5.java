import java.util.Scanner;
import java.util.Arrays;
public class Number5 {
    public static void main(String[] args) {
        int score, student, sum = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("학생의 수를 입력하세오 : ");
        student = sc.nextInt();
        int get[] = new int[student];

        for(int i =0; i<student; i++){
            System.out.print("학생"+(i+1)+"의 성적을 입력하세요: ");
            score = sc.nextInt();
            if(score > 100){
                System.out.println("잘못된 성적입니다 다시 입력하세요");
                score = sc.nextInt();
                get[i] = score;
                sum += get[i];
            }else{
                get[i] = score;
                sum += get[i];
            }
        }
        System.out.println(Arrays.toString(get));
        System.out.println("성적 평균은" + sum/student);
        

    }
}
