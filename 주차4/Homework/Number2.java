package 주차4.Homework;
import java.util.Arrays;
import java.util.Scanner;
public class Number2 {
    public static void main(String[] args) {
        int[] i = { 9,8,7,6,5,4,3,2,1};
        Scanner scan = new Scanner(System.in);
        int search = scan.nextInt();
        Arrays.sort(i);
        
        System.out.println(search+"의 위치 : " +Arrays.binarySearch(i, search));
    }
}
