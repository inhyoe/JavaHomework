package 주차3.Homework;

public class Number1 {
    public static void main(String[] args) {
        int max = 0;
        for(int i =900; i<=1000; i++){
            if(search(i)>max){
                max = search(i);
            }
            }
        System.out.println(max);
        // 무식하게 하나하나 하지말고 값을 넣어서 비교하자.
        }
    
    
    static int search(int n){
        int a =1;
        while(n > 1){
        if(n%2 == 0){
            n = n/2;
            a++;
        }
        else if(n%2 != 0){
            n = n*3+1;
            a++;
        }
        }
        return a;
    }
    
}

