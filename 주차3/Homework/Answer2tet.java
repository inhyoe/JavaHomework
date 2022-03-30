package 주차3.Homework;

public class Answer2tet {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <=5000; i++)
            if(isSelf(i) == true)
                sum += i;
            
        System.out.println(sum);
    }

    static boolean isSelf(int n){
        boolean isSelf = true;
        for(int j =1; j<=n; j++){
            if( n == generator(j)){
                isSelf = false;
            }
        }
        return isSelf;
    }

    static int generator(int n){
        int sum = n;
        while( n>0){
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
}
