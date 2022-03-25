package 주차3.Homework;

public class prac {
    public static void main(String[] args) {
        for(int j =1; j<100; j++){
            // int n=100;
            int sum = 0;
            int y = j;
            while(y > 0){
                //받을수
                sum = sum +(y % 10);
                y = y/10;
                System.out.println(sum);
            }
        // System.out.println(n);
        }
        // int i =2;
        // int x =10;
        //     System.out.println(i/x);
    }
}
