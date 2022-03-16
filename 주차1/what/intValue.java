package 주차1.what;

import java.util.Scanner;

public class intValue {
    public static void main(String[] args) {
        int a = 0;
        System.out.println("1~3사이 정수 입력바람");
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        switch(value){
            case 4:
            case 6:
            case 9:
            case 11:
                a = 30;
                break;
            
            case 2:
                a = 27;
                break;

            default:
                a = 31;
                break;
        }
        System.out.println("월의 날수는" + a);
    }
}
