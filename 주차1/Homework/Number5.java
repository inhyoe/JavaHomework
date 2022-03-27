package 주차1.Homework;
import java.util.Scanner;

public class Number5 {
    public static void main(String[] args) {
        int getMoney;
        int price;
        Scanner scan = new Scanner(System.in);
        System.out.print("받은돈");
        getMoney = scan.nextInt();

        Scanner in = new Scanner(System.in);
        System.out.print("상품의 총액");
        price = in.nextInt();
        int tax = price/10;
        
        int exchange = getMoney-(price+tax);
        System.out.println("받은 돈 :"+getMoney);
        System.out.println("상품의 총액 :"+price);
        System.out.println("부가세 :"+tax);
        System.out.println("잔돈 :"+exchange);
    }    
}
