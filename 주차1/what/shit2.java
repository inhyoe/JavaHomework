package JavaHomework.주차1.what;
import java.util.Scanner;
public class shit2 {
    public static void main(String[] args) {
        //윤년이라면?
        // 4의 배수이지만 100의 배수가 아님
        // 400의 배수이거나
        int year;
        System.out.print("날짜 수 :");
        Scanner scan = new Scanner(System.in);
        year = scan.nextInt();
        
        
        if(year%4 == 0 && year%100 != 0 || year%400 ==0){
            System.out.println("날짜수 = 366");
        }else{
            System.out.println("날짜수 = 365");
        }
    }
}
