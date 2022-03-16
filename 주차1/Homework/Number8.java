package 주차1.Homework;

import java.util.Scanner;

public class Number8 {
    
    public static void main(String[] args) {
        System.out.println("문자열 입력");
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        switch(a){
            case "a":
                System.out.println("모음입니다");
                break;
            case "e":
                System.out.println("모음입니다");
                break;
            case "i":
                System.out.println("모음입니다");
                break;
            case "o":
                System.out.println("모음입니다");
                break;
            case "u":
                System.out.println("모음입니다");
                break;
            default:
                System.out.println("자음입니다.");
                break;
        }
    }
}
