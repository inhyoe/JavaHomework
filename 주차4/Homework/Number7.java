package 주차4.Homework;

public class Number7 {
    public static void main(String[] args) {
        long x = (int)Math.pow(2, 100);
        char i[] = Long.toString(x).toCharArray(); // 글자하나하나 때서 문자 배열로 저장
        System.out.println(i.toString());
        for(int j=0; j<i.length; j++){
            System.out.print(i[j] - '0');
        }
    }
}
