package 주차3.Homework;

public class Number1_1 {
    public static void main(String[] args) {
        System.out.print(search(22));
    }   
    static int search(int n){
        int a =0;
        while(n > 0){
        if(n%2 == 0){
            System.out.println(n);
            n = n/2;
            a++;
        }
        else if(n%2 != 0){
            if(n ==1){
                a++;
                System.out.println(n);
                return a;
            }
            System.out.println(n);
            n = n*3+1;
            a++;
        }
        }
        return a;
        
    } 
}
