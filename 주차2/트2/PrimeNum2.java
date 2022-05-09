package 주차2.트2;

public class PrimeNum2 {
    public static void main(String[] args) {
        for(int i =2; i<=100; i++){
            boolean k = true;
            for(int j = 2; j<i; j++)
                if(i%j == 0)
                    k = false;
            if(k == true){
                System.out.println(i);
        }
    }
    }
}
