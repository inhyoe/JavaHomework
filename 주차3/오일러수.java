package 주차3;

public class 오일러수 {
    public static void main(String[] args) {
        double e = 1.0;

        for(int i =1; i<=20; i++)
            e += 1.0/factorial(i);

        System.out.println("오일러 수 = " + e);    
    }
    
    static long factorial(int n){
        long fact =1;
        for(int i =1; i<=n; i++){
            fact = fact*i;
        }
        return fact;
    }
    
}

