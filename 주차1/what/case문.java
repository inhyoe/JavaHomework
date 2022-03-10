package JavaHomework.주차1.what;
import java.util.Scanner;
public class case문 {
    public static void main(String[] args) {
        System.out.print("점수를 입력하세요");
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        int real = score/10;
        switch(real){
            case 10:
            case 9:
            System.out.println("학점 A");
            break;
            case 8:
            System.out.println("학점 B");
            break;
            case 7:
            System.out.println("학점 C");
            break;
            case 6:
            System.out.println("학점 D");
            break;
            default:
            System.out.println("학점 F");
            break;
        }
    }
}
