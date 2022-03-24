package 주차2.JavaHomework2;

public class Number2 {
    public static void main(String[] args) {
        for(int i = 2; i<=100;i++){
            
            boolean x = true;
            for(int j=2; j<i; j++)
                if(i%j == 0)
                    x = false;
            if(x == true)
            System.out.print(i+" ");
            
        }
    }
}
