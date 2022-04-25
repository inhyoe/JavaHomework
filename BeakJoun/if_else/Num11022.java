package BeakJoun.if_else;

import java.util.Scanner;

public class Num11022 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int caseNum = scan.nextInt();
        
        for(int i =1;i<=caseNum;i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println("Case #" + i +": "+ a +" + "+ b +" = "+ (a+b));
        }
        scan.close();
    }
}
