package 주차4.수업;

import java.util.Arrays;
import java.util.Scanner;

public class SeqSearch {
    public static void main(String[] args) {
        
        int s[] = new int[10];
        int value, i;
        for(i = 0; i<10; i++)
            s[i] = (int)(Math.random()*10)+1; 
            // System.out.print(s[i]+" "); --> 대체하는 코드 Arrays.toString(s) ** 자주 쓸듯.
        
        System.out.println(Arrays.toString(s));

        Scanner scan = new Scanner(System.in);
        System.out.print("탐색할 값을 입력하시오 : ");
        value = scan.nextInt();

        int index = search(s, value);

        if(index >= 0)
            System.out.println("찾은위치 = " + index);
        else
            System.out.println("없음");

        // for( i = 0; i<s.length; i++)
        //     if(s[i] == value)
        //         break;
        
        // if(i< s.length)
        //     System.out.println("찾은위치 = " + i);
        // else
        //     System.out.println("없음");
        // 배열과 찾을값 입력
        // 반환값 int
    }
    static int search(int[] arr, int target){
        int i;

        for( i = 0; i<arr.length; i++){
            if( arr[i] == target)
                // break;
                return i;
        }
        // if(i< arr.length)
        //     return i;
            return -1;
    }
}
