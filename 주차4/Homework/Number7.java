package 주차4.Homework;

import java.math.BigInteger;
import java.util.Arrays;

public class Number7 {
    public static void main(String[] args) {
        
        BigInteger a = new BigInteger("2");
        BigInteger b = a.pow(100);      // long의 범위를 넘어가는 숫자이기에 BigInteger 사용
        String c = b.toString();        // String으로 변경
        System.out.println(b);
        char[] arr = new char[c.length()];      // 배열 생성

        for (int i = 0; i < c.length(); i++) {      // 배열에 숫자 하나씩 집어 넣는 반복문 생성
            arr[i] = c.charAt(i);
        }

        System.out.println(Arrays.toString(arr));       // 배열 출력.

    }
}
// 2
// 4
// 8
// 6 1
// 2 3
// 4 6
// 8 2 1