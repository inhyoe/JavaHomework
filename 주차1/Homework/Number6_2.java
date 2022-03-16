package 주차1.Homework;


import java.util.Scanner;

public class Number6_2 {
    public static void main(String[] args) {
        int i, j; // 포문을 돌리기 위한 변수
        Scanner sc = new Scanner(System.in);

        System.out.print("16진수 문자열을 입력하시오: ");
        String input = sc.nextLine();

        String[] hexa2bin = { "0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "0111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111" }; // 15까지 2진수로 표현

        char[] hexa = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'a', 'b', 'c', 'd', 'e', 'f' }; // 15까지 16진수로 표현, 10이상은 알파벳으로 표기

        for (i = 0; i < input.length(); i++) { // input.length() == 문자열의 길이만큼 돌림 인풋한 글자수 만큼 문자열을 돌림
            for (j = 0; j < hexa.length; j++) { // hexa.length == 문자의 길이만큼 돌림
                if (input.charAt(i) == hexa[j]) // hexa2bin에 위치한 2진수랑 hexa에 위치한 알파벳 혹은 숫자랑 일치시 출력
                    // charAt==문자열에서 원하는 번째에 있는 수를 char형태로 바꿔줌.
                    System.out.print(hexa2bin[j] + " "); // 일렬로 나열
            }
        }
    }

}