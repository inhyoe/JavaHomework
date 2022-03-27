package 주차2.Test;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int answer = (int)(Math.random()*100+1);
        System.out.println(answer);

        int guess;
        int tries = 0;

        do{
            System.out.print("맞춰보세요! : ");
            guess = scan.nextInt();

            if(answer < guess){
                System.out.println("답이 작습니다");
            }else if(answer > guess){
                System.out.println("답이 큽니다");
            }
            tries +=1;
        }while(answer != guess);
        System.out.println("축하합니다 시도횟수 : " + tries);
    }
}
