package 주차3.Homework;

public class Number1 {
    public static void main(String[] args) {
        int big = 0;
        for(int i =900; i<=1000; i++){
            for(int j = 900; j<=1000; j++){
            if(search(i)>search(j)){
                big = search(i);
                
            }else{
                big = search(j);
            }
        }
    }
    
    System.out.println(big);
    }

    static int search(int n){
        int a =0;
        while(n != 1){
        if(n%2 == 0){
            n = n/2;
            a++;
        }
        else if(n%2 != 0){
            n = n*3+1;
            a++;}
        }
        return a+1;
        
    }

}
