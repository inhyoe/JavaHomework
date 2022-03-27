package 주차3.Homework;

import java.util.Scanner;

public class Number5_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String upperInput = input.toUpperCase(); // 대소문자 구별 삭제
        int x = 0;
        if (check(upperInput, upperInput.length() - 1, x) == 1) {
            System.out.println(true); // 1번째 = 대입할 문자 2번째 대입할 맨 뒷 문자 3번째 대입할 맨 앞 문자
            // 만일 true라면 true출력
        } else {
            System.out.println(false);
        }

    }

    static int check(String letter, int n, int y) {
        if (letter.charAt(n) == letter.charAt(y)) {
            // 맨 처음 문자~ 맨 마지막 문자 비교
            if (n == 0) {
                return 1;
            }

            return check(letter, n - 1, y + 1); // 재귀한다.
        } else {
            return -1; // 아니라면 false리턴
        }
    }
}
// 회문인지 체크하는 방법
// 첫글자라면 n(0~n.charAt(n.length())-1)번째부터
// 마지막 글자라면 n.charAt(n.length())-1~n번째까지
// 이 두 문자열을 비교하여 만약 같다면 true가 출력되고
// 두 문자열이 같지 않다면 false 가 출력이 된다.
// 재귀함수는 리턴값을 letter.charAt(letter.length(n-1))까지 반복.
// 다시
// 문자열을 입력받는다
// 비교방법
// 문자열이 만약 noon이라면
// letter.length()는 4가 될것이고
// letter.charAt(letter.length()-(letter.length부터 1까지)))은 n이 될것이다(첫글자)
// letter.length부터 1까지 구현하는 방법
// int letter.length()
// 반대로
// letter.charAt(letter.length()-(1부터 n까지 증가))도 n이 된다.(마지막글자)
// 이제 n이 0일때 까지 반복을 하면 return 1을 반환한다.
