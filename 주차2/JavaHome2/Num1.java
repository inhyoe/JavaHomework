package 주차2.JavaHome2;

public class Num1 {
    public static void main(String[] args) {
        int num = 0;
        int sum =0 ;

        for(int i =1; i<=100; i++){
            num += i;
            sum = sum + num;
        }
        System.out.println(sum);
    }
}
