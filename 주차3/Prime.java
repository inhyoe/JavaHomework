package 주차3;

public class Prime {
    public static void main(String[] args) {
        int cnt = 0;
        for( int i =1; i<=1000; i++){
            if(isPrime(i)){
                System.out.printf("%4d",i);
                cnt++;
                if(cnt%10==0)
                    System.out.println();
                
            }
        }
    }
        static boolean isPrime(int n){
            if(n ==1)
                return false;
            for(int i=2; i<n; i++)
                if(n%i ==0)
                    return false;
            return true;
        }
        
    }
    

