package 주차2.JavaHomework2;

public class Number1{
    public static void main(String[] args) {
        int sum = 0;
        int total = 0;
        for(int i =1; i<=100; i++){
            sum += i;
            total += sum;
        }
        System.out.println("합은 "+total);
}
}