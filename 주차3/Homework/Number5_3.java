package 주차3.Homework;

public class Number5_3 {
    public static void main(String[] args) {
        String s = "nojon";
        if (check(s, 0, s.length() - 1) == 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    static int check(String letter, int left, int right) {
        // 여기까지 왔으면 palindrome 이다
        if (left >= right)
            return 1;

        // 다른 문자일 경우 palindrome 이 아님
        if (letter.charAt(left) != letter.charAt(right))
            return 0;

        // 다음 문자 비교
        return check(letter, left + 1, right - 1);
    }
}
