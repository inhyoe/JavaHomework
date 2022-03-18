package 주차2.JavaHomework2;

public class Number7 {
    public static void main(String[] args) {
        int oddOrEven = 1;
        double up = 4;
        double pie = 0;
        int j = 1;
        for(int i = 1; i<=10000; i++){
            
            if(oddOrEven%2 == 1){
                //홀수
                pie += up/j;
                System.out.println(i+"번째 ="+pie);
            }else
                pie -= up/j;
                System.out.println(i+"번째 ="+pie);
            
            oddOrEven++;
            j =j+2;
        }
        System.out.println("합은"+pie);
    }
}
