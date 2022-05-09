package 주차2.JavaHome2;

public class Num2 {
    public static void main(String[] args) {
        //2와 100 사이의 모든 소수찾기
        boolean a;
        for(int i= 2; i<=100; i++){
            a= true;
            for(int k=2;k<i;k++){
                if(i%k==0)
                    a = false;
                
            }
            if(a == true)
                System.out.println(i + " ");
            
            
        }
    }
}
