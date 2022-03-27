package 주차2.Test;
import java.util.Scanner;
public class 삼각형별 {
    public static void main(String[] args) {

        // 사용자가 3을 입력했을 때 ,
        // 3칸이 출력이 되어야 하니까.
        // 첫번째 for문은 빼주는 방식으로
        // 5입력
        //  i = 4 3 2 1 0
        //  j = 
        
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        for(int k = 1; k<=x; k++){
            for(int i =x; i-k>0; i--){
                System.out.print(" ");
            }
            for(int j=1; j<=(k*2)-1; j++){
                System.out.print("*");
            }
            System.out.println();
            
        }
        
    }
}
