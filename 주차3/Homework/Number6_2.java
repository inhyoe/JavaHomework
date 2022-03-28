package 주차3.Homework;
import java.util.Scanner;
public class Number6_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String n;
        n = scan.nextLine();
        

        System.out.println(getString(n));
    }

    static String getString(String n){
        String Front = n, Back = "";

        if (n.indexOf(".") > -1) {
            Front = n.substring(0, n.indexOf("."));
            System.out.println(Front);
            Back = n.substring(n.indexOf("."), n.length());
            System.out.println(Back);
        }
        for( int i = n.length() -3; i>0; i -= 3){
            Front = n.substring(0, i) + "," + n.substring(i, n.length());
            System.out.println(n);
        }
        return Front+Back;
    }
}
