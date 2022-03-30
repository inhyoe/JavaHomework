package 주차4.수업;
import java.util.Arrays;
public class forEach루프 {
    public static void main(String[] args) {
        int[] numbers = {10,20,30};
        for(int value : numbers) //원소에 대해서 하나씩 순차적으로 배열.
            System.out.print(value + " "); // for문에 비해 융통성이 없음 ( 무조건 순차 접근 )
        }
}
